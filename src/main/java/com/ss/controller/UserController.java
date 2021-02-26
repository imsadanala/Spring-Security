package com.ss.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.dto.User;
import com.ss.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/users")
	public List<User> getUsers() {
		return userService.findAll();
	}

//	@GetMapping(path = "/users/{id}")
//	public EntityModel<User> getUser(@PathVariable Integer id) {
//
//		User user = userService.findById(id);
//		if (user == null) {
//			throw new UserNotFoundExeption("id-" + id);
//		}
//		EntityModel<User> resource = EntityModel.of(user);
//		WebMvcLinkBuilder retrieveUsersLink = linkTo(methodOn(this.getClass()).getUsers());
//		resource.add(retrieveUsersLink.withRel("all-users"));
//		return resource;
//	}

	@PostMapping(path = "/users")
	public User add(@Valid @RequestBody User user) {
		return userService.add(user);
	}

	@DeleteMapping(path = "/users/{id}")
	public List<User> removeUser(@PathVariable Integer id) {
		return userService.deleteById(id);
	}
}
