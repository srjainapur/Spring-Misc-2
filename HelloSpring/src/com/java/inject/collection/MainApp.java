package com.java.inject.collection;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Inject_Collection.xml");
		JavaCollection collect = (JavaCollection)context.getBean("javaCollection");
		
		System.out.println("Java Address List : \n" + collect.getAddressList());
		System.out.println("\nJava Address Set : \n" + collect.getAddressSet());
		System.out.println("\nJava Address Map : \n" + collect.getAddressMap());
		System.out.println("\nJava Address Property  : \n" + collect.getAddressProp());
		
		System.out.println("\n-------------------- List Example-----------------------");
		Customer cust = (Customer)context.getBean("customer");
		//System.out.println("\n" + cust.getListOfObj());
		for (Object obj : cust.getListOfObj()) {
			if(obj instanceof Person) {
				System.out.println("----- Person Object -----");
				Person p = (Person)obj;
				System.out.println("Person Name " + p.getName());
				System.out.println("Person Age " + p.getAge());
				System.out.println("Person Address " + p.getAddress());
				System.out.println("\n");
			} else {
				System.out.println("----- Primitive String -----");
				System.out.println(obj +"\n");
			}
		}
		
		System.out.println("\n-------------------- Set Example-----------------------");
		for (Object set : cust.getSetOfObj()) {
			if(set instanceof Person) {
				System.out.println("----- Person Object -----");
				Person p = (Person)set;
				System.out.println("Person Name " + p.getName());
				System.out.println("Person Age " + p.getAge());
				System.out.println("Person Address " + p.getAddress());
				System.out.println("\n");
			} else {
				System.out.println("----- Primitive String -----");
				System.out.println(set +"\n");
			}
		}
		
		System.out.println("\n-------------------- Map Example-----------------------");		
		for (Map.Entry<Object, Object> entry : cust.getMapOfObj().entrySet()) {
			if(entry.getValue() instanceof Person) {
				System.out.println("----- Person Object -----" + entry.getKey());
				Person p = (Person)entry.getValue();
				System.out.println("Person Name " + p.getName());
				System.out.println("Person Age " + p.getAge());
				System.out.println("Person Address " + p.getAddress());
				System.out.println("\n");
			} else {
				System.out.println("----- Primitive String -----");
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}
