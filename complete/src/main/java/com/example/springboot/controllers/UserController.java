package com.example.springboot.controllers;

import com.example.springboot.entities.Username;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.User;

@RestController
public class UserController {

    @GetMapping("/info")
	public String userInfo() {
		Username username = new Username();
		username.setUserId(123);
		username.setFirstName("Daniel");
		username.setLastName("Vandagriff");
		return username.getUserId() + " " + username.getFirstName() + " " + username.getLastName();
	}

}
