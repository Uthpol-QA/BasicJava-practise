package com.arrayCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {

//	reverse array

// 1st way, loop
		int[] myArray = { 2, 3, 4, 5 };

		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.println(myArray[i]);
		}

// 2nd way, Collections
		List<Integer> myList = Arrays.asList(2, 3, 4, 5);
		Collections.reverse(myList);
		System.out.println(myList);
	}
}
