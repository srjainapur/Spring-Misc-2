package com.java.spring.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire_byname/Bean_Config.xml");
		EmployeeManager empManger = (EmployeeManager)context.getBean("empManager");
		empManger.printEmployee();
	}
}
