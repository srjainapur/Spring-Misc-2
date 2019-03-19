package com.java.eight;

public class MethodRefDemo {
	public void show() {
		System.out.println("Demo implementation of show");
	}
	
	public static void main(String[] args) {
		MethodRefDemo mDemo = new MethodRefDemo();
		MethodRefInterf mif = mDemo :: show;
		mif.show();
	}
}
