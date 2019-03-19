package com.java.spring.jdbc.bean;

public class Student {
	private int studNo;
	private String firstName;
	private String lastName;
	private int phoneNum;
	
	public int getStudNo() {
		return studNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
}
