package com.java.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> i > 20;
		System.out.println("10 is greater than 20 ? " + p.test(10));
		
		Predicate<String> str = (s1) -> s1.length() > 3;
		System.out.println("Avishka name lenght is greater than 3 ? " + str.test("Avishka"));
		
		Predicate<List<String>> col = (c) -> c.isEmpty();
		System.out.println("Is List is empty : " + col.test(new ArrayList<String>()));
		
		ArrayList<String> al = new ArrayList<>();
		al.add("ad");
		System.out.println("Is List is empty : " + col.test(al));
	}
}
