package com.java.constructor.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Constructor_DI.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
		
		User user = (User)context.getBean("user");
		System.out.println(user.toString());
		
		User userId1 = (User)context.getBean("userId1");
		System.out.println("\n"+userId1.toString());
		
		System.out.println("------------------------------------------------");
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp.toString());
		
		Employee empStr = (Employee)context.getBean("employeeStr");
		System.out.println(empStr.toString());
		
		Employee empIntString = (Employee)context.getBean("empIntString");
		System.out.println(empIntString.toString());
	}
}
