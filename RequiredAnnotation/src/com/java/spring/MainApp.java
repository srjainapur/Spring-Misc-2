package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.bean.Student;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student std = (Student)context.getBean("student");
		System.out.println("Student Name is : " +std.getName() + " Age is : " + std.getAge());
	}
}
