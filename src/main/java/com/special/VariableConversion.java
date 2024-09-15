package com.special;

public class VariableConversion {

	public static void main(String[] args) {

		int a = Integer.parseInt("10");
		System.out.println(a);

		double s = Double.parseDouble("123.56");
		System.out.println(s);

		int b = 10;
		String value = String.valueOf(b);
		System.out.println(value);

		double c = 10.25;
		String value2 = String.valueOf(c);
		System.out.println(value2);

		String obj = new String();
		obj.contains(obj);
	}
}