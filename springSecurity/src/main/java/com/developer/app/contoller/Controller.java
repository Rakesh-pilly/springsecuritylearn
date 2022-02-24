package com.developer.app.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome user</h1>");
	}

	
	@GetMapping("/admin")
	public String adim() {
		return ("<h1>Welcome adim</h1>");
	}
	
	
	
}
