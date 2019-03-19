package com.java.spring.constr.di;

public class Employee {
	
	private int empNo;
	private String fname;
	private String lname;
	private String email;
	
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void printEmpData() {
		System.out.println("--------- Emplyee Information ---------");
		System.out.println("Employee Number            " + empNo);
		System.out.println("Employee First Name        " + fname);
		System.out.println("Employee Last Name         " + lname);
		System.out.println("Employee Email             " + email);
		System.out.println("--------- Emplyee Information ---------");
	}
}
