package com.java.autowire.byType.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire_byType_config.xml");
		Application app = (Application)context.getBean("application");
		System.out.println(app.toString());
	}
}
