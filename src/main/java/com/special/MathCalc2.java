package com.special;

public class MathCalc2 {

	static int a = 10;
	static int b = 20;
	int c = 30;

	static int summ = a + b;
	static int subst = b - a;
	int divis = c / a;
	int multi = a * b * c;

	public static void sum() {
		System.out.println(summ);
	}

	public static void subs() {
		System.out.println(subst);
	}

	void mul() {
		System.out.println(multi);
	}

	void div() {
		System.out.println(divis);
	}

	public static void main(String[] args) {
		MathCalc2.sum();
		MathCalc2.subs();
		MathCalc2 obj = new MathCalc2();
		obj.mul();
		obj.div();
	}
}
