package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(" com.example.demo")
public class MainController {
	
	@GetMapping("/")
	public String Hello() {
		return "Hello Welcome to online Deployment on EC2";
	}
	

}
