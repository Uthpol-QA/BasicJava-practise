package com.basic;

public class ForLoop2 {

	static int[] a = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int x : a) {
			System.out.print(x);
		}

	}
}
