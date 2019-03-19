package com.java.bean.def.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean_Def_Template.xml");
		HelloIndia india = (HelloIndia)context.getBean("helloIndia");
		india.getMessage1();
		india.getMessage2();
		india.getMessage3();
	}
}
