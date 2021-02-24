package com.ss.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timeStamp;
	private String details;
	private String message;

	public ExceptionResponse(Date timeStamp, String details, String message) {
		super();
		this.timeStamp = timeStamp;
		this.details = details;
		this.message = message;
	}

}
