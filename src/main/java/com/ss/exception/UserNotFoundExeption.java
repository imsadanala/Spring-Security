package com.ss.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundExeption extends RuntimeException {

	private static final long serialVersionUID = -2670505063174918079L;

	public UserNotFoundExeption() {

	}

	public UserNotFoundExeption(String msg) {
		super(msg);
	}
}
