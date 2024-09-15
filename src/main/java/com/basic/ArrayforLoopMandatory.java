package com.basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayforLoopMandatory {

	public static void main(String[] args) {

		List<String> myList2 = new ArrayList<>();

		myList2.add("book");
		myList2.add("pen");
		myList2.add("sky");
		myList2.add("cloud");
		myList2.add("book");
		myList2.add("sun");

		for (int i = 0; i < myList2.size(); i++) {
			System.out.println(myList2.get(i));

// enhance forLoop or forEach loop
			for (String Value : myList2) {
				System.out.println(Value);
			}

			myList2.forEach(System.out::println);

		}
	}
}
