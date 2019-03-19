package com.java.spring.auto.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire_constructor/Bean_Config.xml");
		EmployeeManager manager = (EmployeeManager)context.getBean("empManager");
		manager.printEmployee();
	}
}
