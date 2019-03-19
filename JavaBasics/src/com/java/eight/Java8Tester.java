package com.java.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Java8Tester {
	public static void main(String[] args) {
		ArrayList<String> nameList1 = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		nameList1.add("Satish");
		nameList1.add("Avishka");
		nameList1.add("Samanvi");
		nameList1.add("Nisha");
		nameList1.add("Neha");
		
		nameList2.add("Satish");
		nameList2.add("Avishka");
		nameList2.add("Samanvi");
		nameList2.add("Nisha");
		nameList2.add("Neha");
		
		System.out.println("Java 7 Sorting Name List 1 B4 sorting");
		System.out.println(nameList1);
		Java8Tester jst = new Java8Tester();
		jst.sortUsingJava7(nameList1);
		System.out.println("\nJava 7 Sorting Name Name List 1 After sorting");
		System.out.println(nameList1);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("\nJava 8 Sorting Name List 1 B4 sorting");
		System.out.println(nameList2);
		jst.sortUsingJava8(nameList2);
		System.out.println("\nJava 8 Sorting Name Name List 1 After sorting");
		System.out.println(nameList2);
	}
	
	public void sortUsingJava7(ArrayList<String> nameList) {
		Collections.sort(nameList, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}
	
	public void sortUsingJava8(ArrayList<String> nameList) {
		Collections.sort(nameList, (s1, s2) -> s1.compareTo(s2));
	}
}
