package com.java.autowire.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean_Autowiring.xml");
		TextEditor editor = (TextEditor)context.getBean("textEditor");
		editor.getSpellChecker().checkSpelling();
		
		System.out.println(editor.getStudent().getName());
	}
}
