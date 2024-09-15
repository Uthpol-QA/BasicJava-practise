package com.special;

public class MathExpert {
//using void & non-void(return), static & non-static method
	static int a;
	static int b;
	static int total;

//passing argument + using constructor
	public MathExpert(int a, int b) {
		MathExpert.a = a;
		MathExpert.b = b;
	}

	public static void sum() {
		System.out.println("sum value is =" + (a + b));
	}

	public int minus() {
		System.out.println("minus value is =" + (b - a));
		return total;
	}

	public static int divide() {
		System.out.println("divide value is =" + (b / a));
		return total;
	}

	public int multiply() {
		System.out.println("multiply value is =" + (a * b));
		return total;
	}

}
