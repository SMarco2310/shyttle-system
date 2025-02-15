//package com.ashesi.shuttle.service;
//
//import com.ashesi.shuttle.config.MtnOAuth2Config;
//import com.github.benmanes.caffeine.cache.Cache;
//import com.github.benmanes.caffeine.cache.Caffeine;
//import io.helidon.webclient.api.WebClient;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.TimeUnit;
//
//@Service
//public class MtnTokenService {
//    private final WebClient webClient;
//    private final MtnOAuth2Config config;
//    private final Cache<String, String> tokenCache;
//
//    public MtnTokenService(WebClient.Builder webClientBuilder, MtnOAuth2Config config) {
//        this.config = config;
//        this.webClient = webClientBuilder.build();
//
//        this.tokenCache = Caffeine.newBuilder()
//                .expireAfterWrite(55, TimeUnit.MINUTES) // MTN tokens typically expire in 1 hour
//                .build();
//    }
//
//    public Mono<String> getAccessToken() {
//        return Mono.defer(() -> {
//            String cachedToken = tokenCache.getIfPresent("mtn_access_token");
//            if (cachedToken != null) {
//                return Mono.just(cachedToken);
//            }
//            return fetchNewAccessToken();
//        });
//    }
//
//    private Mono<String> fetchNewAccessToken() {
//        return webClient.post()
//                .uri(config.getTokenUri())
//                .header("Ocp-Apim-Subscription-Key", config.getSubscriptionKey())
//                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                .body(BodyInserters.fromFormData()
//                        .with("client_id", config.getClientId())
//                        .with("client_secret", config.getClientSecret())
//                        .with("grant_type", config.getGrantType())
//                )
//                .retrieve()
//                .onStatus(HttpStatusCode::isError, response ->
//                        response.bodyToMono(String.class)
//                                .flatMap(error -> Mono.error(new MtnAuthException(
//                                        "Failed to get token: " + error)))
//                )
//                .bodyToMono(JsonNode.class)
//                .flatMap(tokenResponse -> {
//                    String token = tokenResponse.get("access_token").asText();
//                    tokenCache.put("mtn_access_token", token);
//                    return Mono.just(token);
//                })
//                .retryWhen(Retry.backoff(3, Duration.ofSeconds(1))
//                        .filter(throwable -> throwable instanceof MtnAuthException)
//                );
//    }
//}