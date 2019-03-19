package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			l1.add(i);
		}
		
		System.out.println("ArrayList elements " + l1);
		List<Integer> collect = l1.stream().filter(i -> i % 2 ==0).collect(Collectors.toList());
		System.out.println("Filtered List : " + collect);
		
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("Avishka");
		nameList.add("Samanvi");
		nameList.add("Nisha");
		nameList.add("Neha");
		nameList.add("Anita");
		nameList.add("Avishka");
		nameList.add("Avishka");
		nameList.add("Samanvi");
		nameList.add("Neha");
		nameList.add("Anita");
		nameList.add("Anita");
		nameList.add("Anita");
		
		System.out.println("\nArrayList of Names " + nameList);
		int avCount = (int) nameList.stream().filter(s -> s.equalsIgnoreCase("Avishka")).count();
		int samCount = (int) nameList.stream().filter(s -> s.equalsIgnoreCase("Samanvi")).count();
		int nisCount =(int)nameList.stream().filter(s -> s.equalsIgnoreCase("nisha")).count();
		int nehCount =(int)nameList.stream().filter(s -> s.equalsIgnoreCase("neha")).count();
		int aniCount =(int)nameList.stream().filter(s -> s.equalsIgnoreCase("anita")).count();
		
		System.out.println("Number of occurance of Avishka " + avCount);
		System.out.println("Number of occurance of Samanvi " + samCount);
		System.out.println("Number of occurance of Nisha " + nisCount);
		System.out.println("Number of occurance of Neha " + nehCount);
		System.out.println("Number of occurance of Anita " + aniCount);
		
		
		List<String> collect2 = nameList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println("\nNames whose length is 5 are as follows");
		List<String> collect3 = nameList.stream().filter(s -> s.length() == 5).collect(Collectors.toList());
		System.out.println(collect3);
		
		System.out.println("\nSorting in ascending order");
		List<String> collect4 = nameList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect4);
		
		System.out.println("\nSorting in descending order");
		List<String> collect5 = nameList.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(collect5);
		
		System.out.println("\nSorting in descending order interger");
		List<Integer> collect6 = l1.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(collect6);
		
		System.out.println("\nSecond highest element in list is : " + collect6.get(1));
		
		System.out.println("\nMinimum from Integer list");
		Integer integer = l1.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(integer);
		
		System.out.println("\nLargest element from list");
		Integer integer2 = l1.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(integer2);
	}
}
