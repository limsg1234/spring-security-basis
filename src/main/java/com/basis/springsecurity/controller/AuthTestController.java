package com.basis.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthTestController {

    @GetMapping("/auth")
    public String ok() {
        return "ok!!";
    }

    @GetMapping("/auth2")
    public String ok2() {
        return "ok2!!";
    }
}
