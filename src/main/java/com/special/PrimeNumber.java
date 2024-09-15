package com.special;

public class PrimeNumber {

	public static void main(String[] args) {

		// prime number between 1 and 10

		for (int i = 2; i <= 10; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
