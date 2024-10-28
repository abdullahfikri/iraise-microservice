package com.iraise.user_identity_management_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-identity-management/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(){
        return "success logging in";
    }

    @PostMapping("/logout")
    public String logout(){
        return "success logging out";
    }

}
