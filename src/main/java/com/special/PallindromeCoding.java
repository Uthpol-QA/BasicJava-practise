package com.special;

public class PallindromeCoding {

	public static void PallindromeName() {
		String name = "Sarower";
		System.out.println(name);
		// String = non primitive data type
		// name = variable or literal
		// "Sarower"= value

		String name2 = new String();
		System.out.println(name2);
		// String = class
		// name2= object
		// new = key word , means creating any thing new
		// String() = constructor
	}

	public void getReverse(String name) {// name =SON

		StringBuffer text = new StringBuffer(name);// SON
		System.out.println("Before reverse =" + name);// SON
		String reveseText = text.reverse().toString();// NOS
		System.out.println("After reverse = " + reveseText);// NOS

		if (name.equals(reveseText)) {// true
			System.out.println("Matched ==> Pallindrome");
		} else {// false
			System.out.println("Not Matched ==> not Pallindrome");
		}

	}

	public static void main(String[] args) {
		PallindromeCoding obj = new PallindromeCoding();
		obj.getReverse("MOM");
	}

}
