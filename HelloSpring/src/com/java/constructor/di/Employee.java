package com.java.constructor.di;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("Employee Default Constructor");
	}
	
	public Employee(int pId) {
		System.out.println("Employee Constructor with Id");
		this.id=pId;
	}
	
	public Employee(String pName) {
		System.out.println("Employee Constructor with name");
		this.name=pName;
	}
	
	public Employee(int pId, String pName) {
		System.out.println("Employee Constructor with id & name");
		this.id=pId;
		this.name=pName;
	}
	
	public String toString() {
		return "Id :- " + id + " Name :- "+name;
	}
}
