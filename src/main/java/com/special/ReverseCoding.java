package com.special;

public class ReverseCoding {

	public static void main(String[] args) {

		String country = "United States Of America";
		// reverse method
		String obj = new StringBuffer(country).reverse().toString();
		System.out.println(obj);

		// basic loop

		for (int i = country.length() - 1; i >= 0; i--) {
			System.out.print(country.charAt(i));
		}

	}
}
