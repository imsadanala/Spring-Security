package com.ss.dto;

public class HelloWorld {

	private String name;

	public HelloWorld() {
	}

	public HelloWorld(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}

}
