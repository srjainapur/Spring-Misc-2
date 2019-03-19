package com.java.hello.form.hndler;

public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private String userName;
	private String password;
	private String address;
	private boolean receivePaper;
	private String [] favoriteFrameworks;
	private String gender;
	private String favoriteNumber;
	private String country;
	private String [] skills;
	
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public String[] getSkills() {
		return skills;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setFavoriteNumber(String favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
	
	public String getFavoriteNumber() {
		return favoriteNumber;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setFavoriteFrameworks(String[] favoriteFrameworks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}
	
	public String[] getFavoriteFrameworks() {
		return favoriteFrameworks;
	}
	
	public void setReceivePaper(boolean receivePaper) {
		this.receivePaper = receivePaper;
	}
	
	public boolean isReceivePaper() {
		return receivePaper;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
}
