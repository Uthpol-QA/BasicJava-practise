package com.special;

public class SwapValue {

//	int a = 15;
//	int b = 30;

// print b=15, a=30 : with swapValue	

	public void mySwap(int a, int b) {

		System.out.println("before swap a = " + a);
		System.out.println("before swap b = " + b);

		a = a + b;
		System.out.println("current value a = " + a);

		b = a - b;
		a = a - b;
		System.out.println("after swap a = " + a);
		System.out.println("after swap b = " + b);
	}

	public static void main(String[] args) {
		SwapValue obj = new SwapValue();
		obj.mySwap(-10, 20);
	}
}
