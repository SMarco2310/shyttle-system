package com.ashesi.shuttle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AshesiShuttleSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AshesiShuttleSystemApplication.class, args);
    }

    ApplicationContext applicationContext;
}
