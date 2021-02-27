package com.ss.version.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.version.dto.Name;
import com.ss.version.dto.PersonV1;
import com.ss.version.dto.PersonV2;

@RestController
public class VersionController {

	@GetMapping(value = "/person", params = "version=1")
	public PersonV1 personV1() {
		return new PersonV1("Suresh Sadanala");
	}

	@GetMapping(value = "person", params = "version=2")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Suresh", "Sadanala"));
	}

	@GetMapping(value = "/person", headers = "API-VERSION=1")
	public PersonV1 personH1() {
		return new PersonV1("Suresh Sadanala");
	}

	@GetMapping(value = "/person", headers = "API-VERSION=2")
	public PersonV2 personH2() {
		return new PersonV2(new Name("Suresh", "Sadanala"));
	}
}
