package com.srirama.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srirama.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@GetMapping
	public String greetUser() {
		System.out.println("Welcome to git");
		return "Welocme to git-demo";
	}
	
	@GetMapping("/getall")
	public List<UserDto> getUserData() {
		return Arrays.asList(new UserDto("Srirama", "srirama@gmaidl.com", "Srirama"));
	}
}
