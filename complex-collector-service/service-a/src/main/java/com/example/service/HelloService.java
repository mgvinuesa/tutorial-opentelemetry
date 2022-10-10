package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class HelloService {

	@Value("#{environment.HELLO_URL}")
	private String url;

	public String sayHello() {
		return WebClient.create(url).get().uri("/hello").retrieve().bodyToMono(String.class).block();
	}

}
