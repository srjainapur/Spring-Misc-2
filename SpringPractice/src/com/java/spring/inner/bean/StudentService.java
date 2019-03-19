package com.java.spring.inner.bean;

public class StudentService {
	private Student stud;
	
	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	public Student getStud() {
		return stud;
	}
	
	public void printStudent() {
		stud.printStudInfo();
	}
}
