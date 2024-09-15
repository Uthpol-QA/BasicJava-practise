package com.special;

public class WhoHasNumber3value {

	// from 10 -30 which number has 3

	public static void main(String[] args) {

		int[] num = new int[10]; // initialize the array with size of 10
		int count = 0; // counter for track of index in num[]

		for (int i = 10; i <= 30; i++) {
			if (String.valueOf(i).contains("3")) {
				num[count] = i;
				count++;
			}
		}

	// print contents of array
		for (int i = 0; i < count; i++) {
			System.out.println(num[i]);
		}

	}
}
