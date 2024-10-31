package com.iraise.user_identity_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-identity-management/log")
public class LoggingController {
    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('Log Admin')")
    public String logAdmin() {
        return "Logging admin";
    }

    @GetMapping("/{username}")
    @PreAuthorize("hasAuthority('Log Activity')")
    public String logUser(@PathVariable String username) {
        return "Logging user " + username;
    }
}
