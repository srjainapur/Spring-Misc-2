package com.java.eight;

public class LambdaDemo {
	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
		System.out.println("Adding        10 + 20 = " + addition.operation(10, 20));
		
		MathOperation substraction = (a, b) -> a - b;
		System.out.println("Substraction  20 - 10 = " + substraction.operation(20, 10));
		
		MathOperation multiply = (a, b) -> a * b;
		System.out.println("Multiy        20 * 10 = " + multiply.operation(20, 10));
		
		MathOperation division = (a, b) -> a / b;
		System.out.println("Division      20 / 10 = " + division.operation(20, 10));
		
		interf in = () -> System.out.println("\nImplementation of Intef show method");
		in.show();
	}
}
