package com.demo.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	public String index() {
		return "Spring Boot with Docker - Hello World!";
	}

}
