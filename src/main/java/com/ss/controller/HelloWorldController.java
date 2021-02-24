package com.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ss.dto.HelloWorld;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public HelloWorld helloWorld() {
		return new HelloWorld("Hello-World");
	}

	@GetMapping(path = "/hello-world/{name}")
	public HelloWorld helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorld(String.format("Hello-World: %s", name));
	}
}
