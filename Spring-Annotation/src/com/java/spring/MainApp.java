package com.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.java.spring.appconfig.AppConfig;
import com.java.spring.driver.DataBaseDriver;
import com.java.spring.services.UserService;

public class MainApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DataBaseDriver oracle = context.getBean("oracleDriver", DataBaseDriver.class);
		DataBaseDriver mySQL = context.getBean("mySqlDriver", DataBaseDriver.class);
		
		System.out.println("Oracle driver info:");
        System.out.println(oracle.getInfo());
        
        System.out.println("MySQL driver info:");
        System.out.println(mySQL.getInfo());

        System.out.println("UserService Information");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getDriverInfo());
        
        context.close();
	}
}
