package com.arrivnow.usermanagement.usermanagement.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationResource {
	
	@GetMapping("/greetings")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Greetings";
	}

}