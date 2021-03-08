package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleTest {
	
	@RequestMapping("/api/test")
	public String greeting() {
		
		System.out.println("In method greeting in main package");
		return "Welcome to Spring boot Application. Test Connection Successfull.";
		
	}
	

}
