package com.java.spring.bean;

public class User {
	private String userName;
	private String password;
	private String address;
	private boolean recievePaper;
	private String[] favoriteFrameworks;
	private String gender;
	private String favoriteNumber;
	private String country;
	private String [] skills;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setRecievePaper(boolean recievePaper) {
		this.recievePaper = recievePaper;
	}
	
	public void setFavoriteFrameworks(String[] favoriteFrameworks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setFavoriteNumber(String favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	public String[] getSkills() {
		return skills;
	}
	
	public String getCountry() {
		return country;
	}
	
	public boolean isRecievePaper() {
		return recievePaper;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String[] getFavoriteFrameworks() {
		return favoriteFrameworks;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getFavoriteNumber() {
		return favoriteNumber;
	}
}
