package com.java.setter.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Setter_DI.xml");
		TextEditor textEd = (TextEditor)context.getBean("textEditor");
		textEd.spellCheck();
	}
}
