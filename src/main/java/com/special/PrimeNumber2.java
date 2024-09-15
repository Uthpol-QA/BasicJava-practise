package com.special;

public class PrimeNumber2 {

	public static void main(String[] args) {

		int number = 10; // num check

		if (isPrime(number)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
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
