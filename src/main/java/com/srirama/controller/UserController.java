package com.srirama.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@GetMapping
	public String greetUser() {
		System.out.println("Welcome to git");
		return "Welocme to git-demo";
	}
}
