package com.jayz.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/home")
	public String getHome() {
		return "home";
	}

	@GetMapping("/use")
	public String getme() {
		return "Finally running, thanks get lost AWS...";
	}

}