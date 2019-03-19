package com.java.autowire.byType.xml;

public class ApplicationUser {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Application name is " + name;
	}
}
