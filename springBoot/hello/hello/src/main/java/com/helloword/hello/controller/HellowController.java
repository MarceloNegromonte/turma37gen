package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HellowController {

	@GetMapping
	public String hello() {
		return "Hallo Generation!!!";
	}
}
