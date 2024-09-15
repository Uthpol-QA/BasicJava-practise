package com.arrayCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxAry {

	public static void main(String[] args) {

//	Find max value	

		int[] myArray = { 2, 3, 1, 4 };

// 1st way, Looping *** (old way)		
		// imagine
		int maxValue = myArray[0];

		for (int i = 0; i < myArray.length; i++) {
			// each value = myArray[i]
			System.out.println(myArray[i]);
			// filter
			if (myArray[i] > maxValue) {
				maxValue = myArray[i];
			}
		}
		System.out.println("with loop MaxValue = " + maxValue);

// 2nd way, List supporting collections	(mid level)	
		List<Integer> myList = Arrays.asList(-5, -6, -7, -8);
		int maxWithList = Collections.max(myList);
		System.out.println("with list MaxValue = " + maxWithList);

// 3rd way,	using steam API with arrays (Latest java 8)
		// max() --> max number not in arrays class >> added in steam API
		int max = Arrays.stream(myArray).max().getAsInt();
		System.out.println("with steam MaxValue = " + max);

	}
}