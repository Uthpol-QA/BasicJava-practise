package com.arrayCoding;

public class Find2ndMax {

	public static void main(String[] args) {

//	find 2nd max

		int[] myArray = { 2, 3, 4, 5 };

		// imagine
		int maxValue = myArray[0];
		int secondMaxValue = myArray[0];

		// each value
		for (int i = 0; i < myArray.length; i++) {

			// filter
			if (myArray[i] > maxValue) {
				secondMaxValue = maxValue;
				maxValue = myArray[i];
			}
		}
		System.out.println("Second MaxValue = " + secondMaxValue);
	}
}
