package com.ashesi.shuttle.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AdminConfig {

    @Value("${admin.email}")
    private String adminEmail;

    @Value("${admin.max-users}")
    private int maxUsers;

    // Getters and Setters
}
