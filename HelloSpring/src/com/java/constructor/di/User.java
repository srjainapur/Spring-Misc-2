package com.java.constructor.di;

public class User {
	private String name;
	private int age;
	private String city;
	private String state;
	private int zipCode;
	private String country;
	
	public User(String pName, int pAge, String pCity) {
		this.name = pName;
		this.age = pAge;
		this.city = pCity;
		System.out.println("Constructor with Name Age & City");
	}
	
	public User(int pZipCode, String pState, String pCountry) {
		this.state=pState;
		this.zipCode=pZipCode;	
		this.country=pCountry;
		System.out.println("Constructor with ZipCode State & COuntry");
	}
	
	public String toString() {
		return "Name is :-"+ name + "\nAge is :-" + age + "\nCity is :-" + city 
			+ "\nState is :-" + state + "\nZipcode is :-" + zipCode + "\nCountry is :-" + country;
	}
}
