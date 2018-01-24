package com.soumen.springcore.bean;

public class HelloWorld {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void printMessage() {
		System.out.println("HELLO " + getMessage());

	}

}
