package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {

	private static List<Integer> list;

	public static void main(String[] args) {

		list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 10);

		/*
		 * print even numbers
		 */
		System.out.println("even numbers are - ");
		list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

		/*
		 * count even numbers
		 */

		long count = list.stream().filter(num -> num % 2 == 0).count();

		System.out.println("even numbers count " + count);

		/*
		 * Sum of numbers
		 */
		int sum = list.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).sum();
		System.out.println("sum of odd numbers " + sum);

	}

}
