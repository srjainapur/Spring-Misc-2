package com.java.autowire.byName.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire_byName_conf.xml");
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp.toString());
	}
}
