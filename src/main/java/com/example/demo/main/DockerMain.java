package com.example.demo.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMain {
	@GetMapping("/test")
	public String getData()
	{
		return "Continuous Monitoring on Docker";
	}

	
}
