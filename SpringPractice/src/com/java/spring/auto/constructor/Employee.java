package com.java.spring.auto.constructor;

public class Employee {
	private String enpno;
	private String eName;
	private String eEmail;
	
	public void setEnpno(String enpno) {
		this.enpno = enpno;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	
	public String getEnpno() {
		return enpno;
	}
	
	public String geteName() {
		return eName;
	}
	
	public String geteEmail() {
		return eEmail;
	}
	
	public void printEmployee() {
		System.out.println("---------- Employee Information ----------");
		System.out.println("Employee Number                    : " + enpno);
		System.out.println("Employee Name                      : " + eName);
		System.out.println("Employee Email                     : " + eEmail);
	}
}
