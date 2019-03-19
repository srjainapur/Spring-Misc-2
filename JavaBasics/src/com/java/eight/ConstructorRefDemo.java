package com.java.eight;

public class ConstructorRefDemo {
	public static void main(String[] args) {
		SampleInterf sf = s -> new Sample(s);
		System.out.println(sf.get("From Lambda expression"));
		
		SampleInterf sf1 = Sample :: new;
		System.out.println(sf1.get("From Constructor reference"));
	}
}
