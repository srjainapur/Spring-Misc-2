package com.java.eight;

public class DefaultInheritDemo implements Left, Right{
	
	public void m1() {
		System.out.println("Demo class implementation");
		Left.super.m1();
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		DefaultInheritDemo did = new DefaultInheritDemo();
		did.m1();
	}
}
