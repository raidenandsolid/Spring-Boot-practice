package com.example.springboot.controllers;

import com.example.springboot.service.UsernameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UsernameService service;

    @GetMapping("/info")
    public String userInfo(@RequestParam String id) {
        return service.getUsername(id);
    }

}
