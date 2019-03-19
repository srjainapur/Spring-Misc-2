package com.java.spring.inner.bean;

public class Student {
	private int studNo;
	private String sname;
	
	public int getStudNo() {
		return studNo;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void printStudInfo() {
		System.out.println("---------- Student Information Start Here ----------");
		System.out.println("Student Number            : " + studNo);
		System.out.println("Student Name              : " + sname);
		System.out.println("---------- Student Information Ends Here ----------");
	}
}
