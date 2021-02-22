package com.examples.demo.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleHello {
	
	@RequestMapping("/")
	public String sayHello() {
		
		System.out.println("In method sayHello");
		return "Welcome to Rest API Services.";
		
	}
	
	@RequestMapping("/hello")
	public String greeting() {
		
		System.out.println("In method greeting");
		return "Hello World from Rest API Services";
		
	}
	
	//@GetMapping(path = "/", produces = "application/text")
	@RequestMapping(path = "/hello1")
	public String greeting1() {
		
		System.out.println("In method greeting 1");
		return "Hello World 1 from Rest API Services";
		
	}
	
	@GetMapping(path = "/hello2", produces = "application/text")
	public String greeting2() {
		
		System.out.println("In method greeting 2");
		return "Hello World 2 from Rest API Services";
		
	}

}
