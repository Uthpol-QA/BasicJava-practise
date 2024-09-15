package com.mylab;

public class ForloopString {

	String name = "USA";

	void getName() {
// length() --> get number of characters
		System.out.println(name.length()); 

// positive
		for (int i = 0; i < (name.length()); i++) {
			System.out.println(name.charAt(i)); // charAt() --> to print
		}
	}

// negative : passing arguments
	static void getData(String data) {
		for (int x = (data.length())- 1; x >= 0; x--) {   //--> characters need length()-1
			System.out.print(data.charAt(x)); 
		}
	}

	public static void main(String[] args) {
		ForloopString obj = new ForloopString();
		obj.getName();

		ForloopString.getData("America");
	}
}
