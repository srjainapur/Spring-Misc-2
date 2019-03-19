package com.java.bean.post.process;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean_Post_Proc.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		context.registerShutdownHook();
	}
}
