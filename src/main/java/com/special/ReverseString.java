package com.special;

public class ReverseString {
	public static void BeforeReverse() {
		System.out.println("before reverse=" + "Welcome to world");
	}

	public static void ForLoopReverse() {
//using forLoop reverse
		String name = "Welcome to world";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

//String has no reverse(); String buffer and builder has	
	public static void StringBuilderReverse() {
//using StringBuilder
		StringBuilder obj = new StringBuilder("Green Light");
		System.out.println(obj.reverse());
	}

	public static void StringBufferReverse() {
// Using StringBuffer
		StringBuffer text = new StringBuffer("apple fruit");
		System.out.println("before = " + text);

		String reversetext = text.reverse().toString();
		System.out.println("after = " + reversetext);
	}

	public static void main(String[] args) {
		ReverseString.BeforeReverse();
		System.out.println();

		ReverseString.ForLoopReverse();
		System.out.println();

		ReverseString.StringBuilderReverse();
		System.out.println();

		ReverseString.StringBufferReverse();
		System.out.println();
	}
}
