package com.basic;

public class ArrayBoolean {

	static int[] age = { 50, 60, 70, 80 };

	public static void main(String[] args) {

		for (int i = 0; i < age.length; i++) {

			if (age[i] > 70) {

				System.out.println("Senior citizen");

			}
		}
	}
}
