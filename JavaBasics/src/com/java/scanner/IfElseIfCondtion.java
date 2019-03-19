package com.java.scanner;

import java.util.Scanner;

public class IfElseIfCondtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int number = sc.nextInt();
			if(number%2 != 0) {
				System.out.println("Weird");
			} else if (number%2 == 0 && number <= 5 && number >= 2) {
				System.out.println("Not Weird");
			} else if(number%2 == 0 && number <= 20 && number >= 6) {
				System.out.println("Weird");
			} else if (number%2 == 0 && number > 20) {
				System.out.println("Not Weird");
			}
		}
	}
}
