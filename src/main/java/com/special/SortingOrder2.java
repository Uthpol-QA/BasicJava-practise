package com.special;

import java.util.Arrays;

public class SortingOrder2 {

	public static void main(String[] args) {

		String str = "smarttech";
		
		char[] charArrays = str.toCharArray();
		Arrays.sort(charArrays);

		String sortArrays = new String(charArrays);
		System.out.println(sortArrays);
	}
}
