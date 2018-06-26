package com.springboot.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/hello/{name}")
	public String index(@PathVariable String name){
		return "Hello " + name;
	}

}
