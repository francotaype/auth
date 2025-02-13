package com.francode.auth.presentation.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String welcomeAdmin() {
        return "Welcome, admin";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user")
    public String welcomeUser() {
        return "Welcome, user";
    }

    @PreAuthorize("hasRole('ROLE_INVITED')")
    @GetMapping("/invited")
    public String welcomeInvited() {
        return "Welcome, invited";
    }
}
