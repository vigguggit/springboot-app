package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/viggug")
    public String welcome() {
        return "SriVigneshwararGugan!";
    }
}
