package com.java.bean.post.process;

public class HelloWorld {
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void initMethod() {
		System.out.println("Inside init() method");
	}
	
	public void destroyMethod() {
		System.out.println("Inside destroy method");
	}
}
