package com.java.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean_Annotation.xml");
		Student std = (Student)context.getBean("student");
		System.out.println(std.toString());
	}
}
