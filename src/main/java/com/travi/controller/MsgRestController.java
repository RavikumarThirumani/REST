package com.travi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("welcome")
	public String getWelcomeMsg() {
		return "Welcome";
	}
	
	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {	//ResponseEntity<T> when you want to use your own custom response code.
		String responseBody = "saved successfully.....";
		return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		return "GE";
		}
	}
