package com.mylab;

public class ArrayForLoop {

	static int[] age = { 1, 3, 5, 6 };

	public static void main(String[] args) {
//for loop ++		
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		;
//for loop --
		for (int j = age.length - 1; j >= 0; j--) {
			System.out.println("negative =" + age[j]);
		}
//advance for loop
		for (int z : age) {
			System.out.println(z);
		}
	}
}
