package com.special;

import java.util.Arrays;

public class SortingOrder {

	public static void main(String[] args) {

		String str = "ecbad";
		char[] charArray = str.toCharArray();

		System.out.println("Array before sorting =" + Arrays.toString(charArray));

// Array before sorting =[h, u, m, a, n]

		for (int i = 0; i < charArray.length - 1; i++) {
			for (int j = 0; j < charArray.length - 1; j++) {

				if (charArray[j] > charArray[j] + 1) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}
			}
		}

		String sortStr = new String(charArray);
		System.out.println("Array after sorting =" + sortStr);
	}
}
