package com.arrayCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupArray {

//	remove duplicate from Array

	public static void main(String[] args) {

//	1st way, using Set
		Integer[] myArray = { 2, 3, 4, 3, 2, 4, 5 };

//	direct myArray name not work, first need to keep in list
		List<Integer> myList = Arrays.asList(myArray);

		Set<Integer> mySet = new HashSet<Integer>(myList);
		System.out.println("Remove Dups = " + mySet);

// 2nd way, Loop

		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] == myArray[j]) {
					System.out.println("Dup = " + myArray[i]);
					break;
				}
			}
		}
	}
}
