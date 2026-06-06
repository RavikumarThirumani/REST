package com.travi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.travi.bind.User;

@RestController
public class UserRestController {

	private Map<Integer, User> dataMap = new HashMap<>();
	
	@PostMapping("/saveUser")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		dataMap.put(user.getId(), user);
		return new ResponseEntity<String>("User saved successfully...", HttpStatus.CREATED);
	}
//	@GetMapping("/getUser")
//	public User getUser(@RequestParam("userid") Integer userId) {
//		User user = dataMap.get(userId);
//		return user;
//	}
	@GetMapping("/user/{id}/data")
	public User getUser(@PathVariable("id") Integer userId) {
		User user = dataMap.get(userId);
		return user;
	}
}
