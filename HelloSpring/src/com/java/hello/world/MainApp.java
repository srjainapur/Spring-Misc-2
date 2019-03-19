package com.java.hello.world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean_Config.xml");
		HelloWorld helloObj = (HelloWorld)context.getBean("HelloBean");
		System.out.println(helloObj.getMessage());
	}
}
