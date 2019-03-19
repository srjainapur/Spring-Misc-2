package com.java.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private Integer age;
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String toString() {
		return "Name : " + name + " Age : " + age;
	}
}
