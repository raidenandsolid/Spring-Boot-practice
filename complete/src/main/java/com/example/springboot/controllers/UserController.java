package com.example.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.User;

@RestController
public class UserController {

    @GetMapping("/info")
	public String userInfo(@RequestParam("firstName") String firstName,
                            @RequestParam("lastName") String lastName,
                            @RequestParam("email") String email,
                            @RequestParam("title") String title) {
        User usr = new User(firstName, lastName, email, title);
        // User usr2 = new User("Johnson", "reyrey@rey.com", "Mrs.");
		return usr.getTitle() + " " + usr.getFirstName() + " " + usr.getLastName() + " " + usr.getEmail();
	}

}
