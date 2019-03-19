package com.java.spring.bean;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private Integer age;
	
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
