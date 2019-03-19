package com.java.spring.auto.constructor;

public class EmployeeManager {
	private Employee employee;
	
	public EmployeeManager(Employee employee) {
		this.employee = employee;
	}
	
	public void printEmployee() {
		employee.printEmployee();
	}
}
