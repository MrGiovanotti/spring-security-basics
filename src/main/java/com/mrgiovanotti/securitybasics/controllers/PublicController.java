package com.mrgiovanotti.securitybasics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/public")
public class PublicController {

	@GetMapping("/hello")
	public String helloworld() {
		return "<h1>Hello, anybody can see this page</h1>";
	}

}
