package com.raymond.rest.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	@GetMapping(value="/helloworld")
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(value="*")
	public String getInvalidApi() {
		return "Invalid API";
	}

}
