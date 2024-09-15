package com.special;

public class MathExpert2 {

//another way of passing arguments
	static int a;
	static int b;
	static int total;

	public static void sum(int a, int b) {
		System.out.println("sum value is =" + (a + b));
	}

	public int minus(int a, int b) {
		System.out.println("minus value is =" + (b - a));
		return total;
	}

	public static int divide(int a, int b) {
		System.out.println("divide value is =" + (b / a));
		return total;
	}

	public int multiply(int a, int b) {
		System.out.println("multiply value is =" + (a * b));
		return total;
	}
	
	public static void main(String[] args) {
		MathExpert2 obj = new MathExpert2();
		MathExpert2.sum(20,30);
		obj.minus(30,40);
		MathExpert2.divide(5,25);
		obj.multiply(3,2);
	}
}
