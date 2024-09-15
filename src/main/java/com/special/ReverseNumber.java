package com.special;

public class ReverseNumber {

	// reverse a number 789 to 987
	public static void main(String[] args) {

		int num = 789;
		int rev_num = 0;

		while (num > 0) { // 1st=t, 2nd =f
//			System.out.println("before reverse value= " +num);

			rev_num = rev_num * 10 + num % 10; // 0+98  <===actual formula

			num = num / 10; // zero or less
		}
		System.out.println("after reverse value= " + rev_num);
	}
}