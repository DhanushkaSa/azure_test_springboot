package com.azure.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

	@GetMapping("/message")
	public String hello(){
		return "Hello Azure ! I'm Dhanushka Sandaruwan";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
