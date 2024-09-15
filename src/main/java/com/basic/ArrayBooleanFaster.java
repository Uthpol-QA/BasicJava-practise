package com.basic;

public class ArrayBooleanFaster {

	// formula : (dataType anyName:ArrayName)

	static int[] peopleAge = { 50, 60, 70, 80 };

	public static void main(String[] args) {

		for (int i : peopleAge) {
			System.out.println(i);
			
			if (i>70) {
				System.out.println("person is senior");
			}
			
			
		}
	}
}
