package com.java.spring.bean.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritMainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_inherit/Bean_Config.xml");
		ParentBean pBean = (ParentBean)context.getBean("parentBean");
		System.out.println(pBean.getProperty1());
		System.out.println(pBean.getProperty2());
		System.out.println(pBean.getProperty3());
		
		ChildBean cBean = (ChildBean)context.getBean("childBean");
		System.out.println(cBean.getProperty1());
		System.out.println(cBean.getProperty2());
	}
}
