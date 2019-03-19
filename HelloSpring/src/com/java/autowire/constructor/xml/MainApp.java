package com.java.autowire.constructor.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire_constructor_conf.xml");
		Performer p = (Performer)ctx.getBean("performer");
		System.out.println(p.toString());
	}
}
