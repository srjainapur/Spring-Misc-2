package com.java.spring.inner.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("inner_bean_di/Bean_Config.xml");
		StudentService studSer = (StudentService)context.getBean("studentService");
		studSer.printStudent();
	}
}
