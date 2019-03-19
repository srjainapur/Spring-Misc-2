package com.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resources/Spring_Bean.xml");
		HelloWorld hello = (HelloWorld)context.getBean("hello");
		System.out.println(hello.getMessage());
	}
}
