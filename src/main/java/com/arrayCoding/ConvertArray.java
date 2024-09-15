package com.arrayCoding;

import java.util.Arrays;
import java.util.List;

public class ConvertArray {

	public static void main(String[] args) {
		int[] myArray = { 2, 3, 4, 5 };
		System.out.println(Arrays.toString(myArray));
		System.out.println("Array total count = " + myArray.length);

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
//	convert with List, List need wrapper class
		Integer[] myArray2 = { 2, 3, 4, 5 };
		System.out.println(Arrays.toString(myArray2));
		
		List<Integer> myList = Arrays.asList(myArray2);
		System.out.println(myList);

	}

}
