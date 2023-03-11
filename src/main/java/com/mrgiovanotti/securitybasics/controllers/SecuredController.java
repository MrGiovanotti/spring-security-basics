package com.mrgiovanotti.securitybasics.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/secured")
public class SecuredController {

	@GetMapping("/user")
	@Secured("ROLE_USER")
	public String user() {
		return "<h1>Hello, you are a normal user</h1>";
	}

	@GetMapping("/admin")
	@Secured("ROLE_ADMIN")
	public String admin() {
		return "<h1>Hello, you are an admin user</h1>";
	}

	@GetMapping("/admin-user")
	@Secured({ "ROLE_USER", "ROLE_ADMIN" })
	public String adminOrUser() {
		return "<h1>Hello, you can be an admin or a normal user</h1>";
	}

}
