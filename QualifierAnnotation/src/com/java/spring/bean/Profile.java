package com.java.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	public Profile() {
		System.out.println("Inside Profile Constructor");
	}
	
	public void printName() {
		System.out.println("Student Name : " + student.getName());
	}
	
	public void printAge() {
		System.out.println("Student Age : " + student.getAge());
	}
}
