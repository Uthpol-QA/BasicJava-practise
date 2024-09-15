package com.basic;

import java.util.Arrays;

public class ArrayCoding {

	static int[] a = { 2, 3, 4, 5 };
	static int[][] b = { { 2, 3, 4, 5 }, { 6, 7, 8, 9 } };

	public static void main(String[] args) {
		// calling array
		System.out.println(Arrays.toString(a)); 
		System.out.println(Arrays.toString(b)); // ??? multi-diamention not possible

		// call by index
		System.out.println(a[2]);
		System.out.println(Arrays.toString(b[1]));

		// length
		System.out.println(a.length);
		System.out.println(b.length);
	}
}
