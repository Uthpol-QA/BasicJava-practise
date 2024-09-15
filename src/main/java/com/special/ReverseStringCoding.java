package com.special;

public class ReverseStringCoding {

	void getData(String text) {
// see text length
		System.out.println("text length is =" + text.length());

		for (int i = text.length() - 1; i > 0; i--) {
			System.out.print(text.charAt(i));
		}
	}

	public static void main(String[] args) {

		ReverseStringCoding obj = new ReverseStringCoding();
		obj.getData("hello World");

	}
}
