package com.java.method.ref;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Method reference
		list.forEach(MethodReference :: print);
		
		// Lambda expression
		list.forEach(number -> MethodReference.print(number));
	}
	
	public static void print(final int number) {
		System.out.println("I am printing number " + number);
	}
}
