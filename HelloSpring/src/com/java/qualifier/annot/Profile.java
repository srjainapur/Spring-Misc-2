package com.java.qualifier.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student1")
	private Student std;
	
	public Profile() {
		System.out.println("Inside Profile constructor." );
	}
	
	public void printName() {
		System.out.println("Name :- " +std.getName());
	}
	
	public void printAge() {
		System.out.println("Age :- " + std.getAge());
	}
}
