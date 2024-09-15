package com.special;

import java.util.Arrays;

public class ArrrarCopy {

	static int[] myarray1 = { 1, 2, 3, 4 };
	static int[] myarrray2 = { 5, 6, 7, 8 };

//want to see concatenated result = {1,2,3,4,5,6,7,8}
// means, these 2 array copy into 1 array

	public static void main(String[] args) {

		// create new array to store concatenated result
		int[] copyArray = new int[myarray1.length + myarrray2.length];

		// copy elements from 1st array to new array
		System.arraycopy(myarray1, 0, copyArray, 0, myarray1.length);

		// copy elements from 2nd array to new array
		System.arraycopy(myarrray2, 0, copyArray, myarray1.length, myarrray2.length);
		// print

		System.out.println("concatenated result = " + Arrays.toString(copyArray));

	}
}
