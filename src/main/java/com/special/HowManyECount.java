package com.special;

public class HowManyECount {

//Count how many 'e' is there

	static String country = "United State of America";

	public static void main(String[] args) {

		int count = 0;
		for (int i = 0; i < country.length(); i++) {// 1
			// System.out.println(country.charAt(i));//2
			// condition
			if (country.charAt(i) == 'e' || country.charAt(i) == 'E') {
				System.out.println("Found letter e");
				count++;// 0>>1>>2>>3
			}
		}
		System.out.println("Letter e total count = " + count);
	}
}
