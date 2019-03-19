package com.java.spring.hello.world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hello_world/Bean_Config.xml");
		HelloWorldBean bean = (HelloWorldBean)context.getBean("helloBean");
		System.out.println(bean.getMessage());
	}
}
