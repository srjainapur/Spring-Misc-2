package com.java.autowire.byName.xml;

public class Employee {
	private EmployeeAddress empAddress;
	
	public EmployeeAddress getEmpAddress() {
		return empAddress;
	}
	
	public void setEmpAddress(EmployeeAddress empAddress) {
		this.empAddress = empAddress;
	}
	
	public String toString() {
		return "Employee Details : \nFirst Name :" + empAddress.getFirstName() 
			+ "\nLast Name : " + empAddress.getLastName()
			+"\nCity : " + empAddress.getCity()
			+"\nState : " + empAddress.getState();
	}
}
