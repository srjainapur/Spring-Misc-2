package com.java.constructor.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean_Constructor_Annot.xml");
		TextEditor text = (TextEditor)context.getBean("textEditor");
		text.spellCheck();
		System.out.println(text.getName());
	}
}
