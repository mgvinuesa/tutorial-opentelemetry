package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@GetMapping(value = "/hello")
	public String sayHello() {
		log.info("The application is saying Hello");
		return "Hello";
	}
}
