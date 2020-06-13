package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/message") 
	public String getMessage(){
		logger.info("You are in MessageController getMessage method.");
		return "Welcome the Spring Boot.";
	}
}
