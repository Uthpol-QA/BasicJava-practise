package com.special;

import java.util.Arrays;

public class ArraySum {

	static int[] myarray1 = { 1, 2, 3, 4 };
	static int[] myarrray2 = { 5, 6, 7, 8 };
// want to see sum on index = Sum of my newArray[6, 8, 10, 12]

	public static void main(String[] args) {

//		creating a new array to store the SUM value
		int[] newSum = new int[myarray1.length];

//      calculate the sum element-wise
		for (int i = 0; i < myarray1.length; i++) {
			newSum[i] = myarray1[i] + myarrray2[i];
		}
		System.out.println("Sum of my newArray = " + Arrays.toString(newSum));
	}
}
