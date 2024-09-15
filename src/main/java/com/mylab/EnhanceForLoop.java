package com.mylab;

public class EnhanceForLoop {

	// works with java collection only

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Enhanced for loop to iterate over the array
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
