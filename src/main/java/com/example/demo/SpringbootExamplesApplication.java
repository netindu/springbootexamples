package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example.demo", "com.examples.demo.rest.api", "com.examples.demo.rest.security.basic"})
@SpringBootApplication
public class SpringbootExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExamplesApplication.class, args);
		
		System.out.println("\nHello World\n");
	}

}
