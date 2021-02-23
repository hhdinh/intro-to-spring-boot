package com.tts.mySpringBootProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@RequestMapping("/")
	public String home() {
		return "My very own project";
	}

}
