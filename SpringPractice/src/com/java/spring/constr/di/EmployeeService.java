package com.java.spring.constr.di;

public class EmployeeService {
	private Employee emp;
	
	public EmployeeService(Employee emp) {
		this.emp = emp;
	}
	
	public void getEmployeeInfo() {
		emp.printEmpData();
	}
}
