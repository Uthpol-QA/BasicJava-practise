package com.special;

public class PrimeNumber_easy {

	public static void main(String[] args) {

		// this is okay for interview, but printing multiple times
		// prime number = if any number divided by 1 or that number
		// any number or prime always divide by 0 & 1 , so start check from 2, here i=2

		int num = 11;

		int middleNum = num / 2;
		boolean isPrime = true;
		for (int i = 2; i < middleNum; i++) {

			if (num % i == 0) {
				System.out.println("Not Prime");
				isPrime = false;
//				break;
//			} else {
//				System.out.println("Prime" + i);
			}
			if (isPrime) {
				System.out.println("Prime number");
			}
		}

	}
}
