package com.java.spring.autowire.byname;

public class Employee {
	private int empNo;
	private String empName;
	private String empEmail;
	
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getEmpEmail() {
		return empEmail;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	public void printEmployee() {
		System.out.println("---------- Employee Information ----------");
		System.out.println("Employee Number                    : " + empNo);
		System.out.println("Employee Name                      : " + empName);
		System.out.println("Employee Email                     : " + empEmail);
	}
}
