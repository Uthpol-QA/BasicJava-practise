package com.basic;

import java.util.Arrays;

public class ForEachLoopSuperfast {

	static int[] peopleAge = { 50, 60, 70, 80 };

	public static void main(String[] args) {
		Arrays.stream(peopleAge).forEach(peopleAge -> {
			System.out.println(peopleAge);

		});
//The -> symbol is known as the arrow operator or lambda operator

	}
}
