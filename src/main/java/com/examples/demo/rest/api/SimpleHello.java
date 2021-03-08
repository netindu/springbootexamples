package com.examples.demo.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleHello {
	
	@RequestMapping("/")
	public String sayHello() {
		
		System.out.println("In method sayHello");
		return "Welcome to Rest API Services!";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/hello")
	public String hello() {
		
		System.out.println("In method hello");
		return "Hello World from Rest API Services!";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/hello/{name}")
	public String greeting(@PathVariable String name) {
		
		System.out.println("In method greeting");
		return "Hello " + name;
		
	}
	
	
	// Alternate ways to use the annotations.
	/*
	@RequestMapping(path = "/api/hello1", method = RequestMethod.GET)
	public String greeting1() {
		
		System.out.println("In method greeting 1");
		return "Hello World 1 from Rest API Services";
		
	}
	
	@GetMapping(path = "/api/hello2", produces = "application/text")
	public String greeting2() {
		
		System.out.println("In method greeting 2");
		return "Hello World 2 from Rest API Services";
		
	}
	
	*/

}
