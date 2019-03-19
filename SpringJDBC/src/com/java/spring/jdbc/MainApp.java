package com.java.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.jdbc.bean.Student;
import com.java.spring.jdbc.temp.StudentJDBCTemplate;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate stdTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		
		System.out.println("------Records Creation--------" );
		//stdTemplate.create(45508, "Samanvi", "Jainapur", 98865);
		System.out.println("------Records Created--------" );
		
		System.out.println("\n-----Get Student with Id 45506 ---------");
		Student std = stdTemplate.getStudent(45506);
		System.out.println("Student No        : " + std.getStudNo());
		System.out.println("Student FirstName : " + std.getFirstName());
		System.out.println("Student LastName  : " + std.getLastName());
		System.out.println("Student Phone Num : " + std.getPhoneNum());
		
		System.out.println("\n-----Get All Students ---------");
		List<Student> stdList = stdTemplate.getStudents();
		for(Student stdd : stdList) {
			System.out.println("Student No        : " + stdd.getStudNo());
			System.out.println("Student FirstName : " + stdd.getFirstName());
			System.out.println("Student LastName  : " + stdd.getLastName());
			System.out.println("Student Phone Num : " + stdd.getPhoneNum());
			System.out.println("\n-----------------------------------");
		}
		
		System.out.println("\n ----- Delete Student with Id 45508-------");
		stdTemplate.delete(45508);
		
		System.out.println("\n ----- Update Student with Id 45508-------");
		stdTemplate.update(45507, 90805);
		
		System.out.println("\n-----Get All Students ---------");
		stdList = stdTemplate.getStudents();
		for(Student stdd : stdList) {
			System.out.println("Student No        : " + stdd.getStudNo());
			System.out.println("Student FirstName : " + stdd.getFirstName());
			System.out.println("Student LastName  : " + stdd.getLastName());
			System.out.println("Student Phone Num : " + stdd.getPhoneNum());
			System.out.println("\n-----------------------------------");
		}
		
	}
}
