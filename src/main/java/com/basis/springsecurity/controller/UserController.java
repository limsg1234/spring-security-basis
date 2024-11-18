package com.basis.springsecurity.controller;

import com.basis.springsecurity.model.Users;
import com.basis.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        System.out.println("user = " + user);
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        System.out.println("user = " + user);
        return service.verify(user);
    }
}
