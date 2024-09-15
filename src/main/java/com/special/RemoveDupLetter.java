package com.special;

public class RemoveDupLetter {

	// Write a code to remove duplicate strings from the given word - "salad"

	public static void main(String[] args) {
		String word = "salad";
		String result = removeDuplicates(word);
		System.out.println("Word with duplicates removed: " + result);
	}

	public static String removeDuplicates(String word) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			if (builder.indexOf(String.valueOf(currentChar)) == -1) {
	// Append the current character if it is not already present
				builder.append(currentChar);
			}
		}
		return builder.toString();
	}

}