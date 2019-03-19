package com.java.spring.auto.bytype;

public class EmployeeManager {
	
	private Employee employee;
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void printEmployee() {
		employee.printEmployee();
	}
}
