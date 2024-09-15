package com.special;

public class SplitWords {
	public static void main(String[] args) {

		// loop arrey in java , brk in 4 pieces
		String country = "united states of america";

		String[] obj = country.split(" ");

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}
