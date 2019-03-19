package com.java.spring.auto.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire_byType/Bean_Config.xml");
		EmployeeManager empManger = (EmployeeManager)context.getBean("empManager");
		empManger.printEmployee();
	}
}
