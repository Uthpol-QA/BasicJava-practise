package com.special;

public class OddEven {

	void checkOddEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is a even number");
		} else {
			System.out.println(num + " is a odd number");
		}
	}
	
	public static void main(String[] args) {
		OddEven obj = new OddEven();
		obj.checkOddEven(1271564);
	}
}



