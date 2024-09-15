package com.special;

public class PallindrimeEasy {

	public static void main(String[] args) {

//		for (int i=a.length()-1;i>=0;i--) {
//		System.out.println(a.charAt(i));	
//		}
		
		
String tx = "usa";
		StringBuilder sb = new StringBuilder(tx);
		
		String afterReverse = sb.reverse().toString();

//save value needed

		if (tx.equals(afterReverse)) {
			System.out.println("It is Pallindrome");
		} else {
			System.out.println("It is Not Pallindrome");
		}
	}
}
