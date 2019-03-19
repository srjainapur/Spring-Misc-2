package com.java.spring.constr.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_di/Bean_Config.xml");
		EmployeeService empSer = (EmployeeService)context.getBean("empServiceBean");
		empSer.getEmployeeInfo();
	}
}
