package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class HelloService {

	private static final Logger log = LoggerFactory.getLogger(HelloService.class);

	@Value("#{environment.HELLO_URL}")
	private String url;

	public String sayHello() {
		log.info("Invoking service-b from service-a to say hello");
		return WebClient.create(url).get().uri("/hello").retrieve().bodyToMono(String.class).block();
	}

}
