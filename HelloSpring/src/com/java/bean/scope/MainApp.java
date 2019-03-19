package com.java.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean_Scope_Config.xml");
		HelloWorld helloObj = (HelloWorld)context.getBean("helloBean");
		System.out.println(helloObj.getMessage());
		
		HelloWorld helloObj1 = (HelloWorld)context.getBean("helloBean");
		
		if(helloObj == helloObj1) {
			System.out.println("both objects are equals");
		} else {
			System.out.println("both objects are differents");
		}
		
		HelloWorld protoObj = (HelloWorld)context.getBean("protoBean");
		HelloWorld protoObj1 = (HelloWorld)context.getBean("protoBean");
		
		System.out.println(protoObj.getMessage());
		System.out.println(protoObj1.getMessage());
		if(protoObj == protoObj1) {
			System.out.println("prototype both objects are equals");
		} else {
			System.out.println("prototype both objects are differents");
		}
	}
}
