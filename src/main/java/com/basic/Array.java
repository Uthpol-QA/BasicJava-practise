package com.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {

//Convert array to array list:
		
//		Integer[] myArray = { 2, 3, 6, 7, 9, 8 };

// List = easy way. but only handle wrapper class
//with list method-		

		List<Integer> myList = Arrays.asList(2, 3, 6, 7, 9, 8);

		int max = Collections.max(myList);
		int min = Collections.min(myList);

		System.out.println("max number = " + max);
		System.out.println("min number = " + min);

// 2nd max & min

		Collections.sort(myList); // ASC

		int secndMin = myList.get(1);
		System.out.println("2nd min = " + secndMin);

//		int secondMax = myList.get(myList.size()-1);
		int secondMax = myList.get(myList.size() - 2);

		System.out.println("2nd max = " + secondMax);

//without list method
//stream method with arrays- 

		int[] myArray2 = { 2, 3, 6, 7, 9, 8 };

		int maxNum = Arrays.stream(myArray2).max().getAsInt();
		System.out.println("max number without list = " + maxNum);
		int minNum = Arrays.stream(myArray2).min().getAsInt();
		System.out.println("max number without list = " + minNum);

	}

}
