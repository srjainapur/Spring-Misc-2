package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.bean.TextEditor;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor editor = (TextEditor)context.getBean("textEditor");
		editor.spellCheck();
		editor.grammerCheck();
		editor.checkImage();
	}
}
