package com.java.autowire.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setter_autowire.xml");
		TextEditor edit = (TextEditor)context.getBean("textEditor");
		edit.spellCheck();
	}
}
