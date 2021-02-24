package com.ss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.dto.User;
import com.ss.exception.UserNotFoundExeption;
import com.ss.repository.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/users")
	public List<User> getUsers() {
		return userService.findAll();
	}

	@GetMapping(path = "/users/{id}")
	public User getUser(@PathVariable Integer id) {

		User user = userService.findById(id);
		if (user == null) {
			throw new UserNotFoundExeption("id-" + id);
		}
		return user;
	}

	@PostMapping(path = "/users")
	public User add(@RequestBody User user) {
		return userService.add(user);
	}
}
