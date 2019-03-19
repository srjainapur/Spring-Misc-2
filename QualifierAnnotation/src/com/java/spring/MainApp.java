package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.bean.Profile;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Profile profile = (Profile)context.getBean("profile");
		profile.printName();
		profile.printAge();
	}
}
