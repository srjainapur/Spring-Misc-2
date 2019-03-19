package com.java.scanner;

import java.util.Scanner;

public class JavaScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter String");
		//String str = sc.next();
		//System.out.println("myString is: " + str);
		//System.out.println("Please enter any number");
		 while (sc.hasNext()) {
			 int number = sc.nextInt();
			 System.out.println("myInt is: " + number);
		 }
		
	}
}
