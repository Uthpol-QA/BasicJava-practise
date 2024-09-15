package com.special;

public class MathCalc {

	static int a = 30;
	static int b = 20;
	static int c = 10;
	
	static int total;

	public static int sum() {
		total = a + b + c;
		System.out.println("sum = " + total);
		return total;
	}

	void minus() {
		total = a - b;
		System.out.println("minus = " + total);
	}

	public static void main(String[] args) {
		MathCalc.sum();

		MathCalc obj2 = new MathCalc();
		obj2.minus();
	}
}
