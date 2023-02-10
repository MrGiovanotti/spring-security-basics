package com.mrgiovanotti.securitybasics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap1/v1/secured")
public class SecuredController {

	@GetMapping("/user")
	public String user() {
		return "<h1>Hello, you are a normal user</h1>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h1>Hello, you are an admin user</h1>";
	}

}
