package com.java.method.ref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParticularInstanceMethodReference {
	public static void main(String[] args) {
		final List<Integer> list = Arrays.asList(1, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		final MyComparator myComparator = new MyComparator();

		// Method reference
		Collections.sort(list, myComparator::compare);
		
		System.out.println(list);

		// Lambda expression
		Collections.sort(list, (a, b) -> myComparator.compare(a, b));
		System.out.println(list);
	}

	private static class MyComparator {
		public int compare(final Integer a, final Integer b) {
			return a.compareTo(b);
		}
	}
}
