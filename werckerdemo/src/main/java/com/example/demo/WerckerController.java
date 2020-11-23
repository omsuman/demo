package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WerckerController {
	@GetMapping("/")
	public String sayHello() {
		return "hello wercker pipeline";
		
	}
}
