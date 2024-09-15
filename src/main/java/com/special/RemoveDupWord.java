package com.special;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupWord {

	public static void main(String[] args) {

// by set method
		String[] array = { "hello", "hello", "world" };

		// Convert array to HashSet to remove duplicates
		Set<String> set = new HashSet<>(Arrays.asList(array));

		// Convert HashSet back to array
		String[] result = set.toArray(new String[0]);

		// Print the result
		System.out.println(Arrays.toString(result));

// by Loop
		String[] array2 = { "hello", "hello", "world" };

		// LinkedHashSet preserves the order of elements
		Set<String> set2 = new LinkedHashSet<>();

		for (int i = 0; i < array2.length; i++) {
			String str = array2[i];
			set2.add(str);
		}

		// Convert LinkedHashSet back to array
		String[] result2 = set2.toArray(new String[0]);

		// Print the result
		System.out.println(Arrays.toString(result2));

	}
}
