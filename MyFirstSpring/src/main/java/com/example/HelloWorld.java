package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld 
{
	@GetMapping("/ABC") // URI
	public String Hello()
	{
		return "Hello All";
	}
}
