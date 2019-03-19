package com.java.call.back;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean_Call_Back.xml");
		HelloWorld hello = (HelloWorld)context.getBean("HelloBean");
		System.out.println(hello.getMessage());
		
		context.registerShutdownHook();
	}
}
