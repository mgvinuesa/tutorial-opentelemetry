package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloService;

@RestController
public class CallHelloController {

	private HelloService service;

	public CallHelloController(HelloService service) {
		this.service = service;
	}

	@GetMapping(value = "/call/hello")
	public String sayHello() {
		return this.service.sayHello();
	}
}
