package com.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListCoding {
	public static void main(String[] args) {
//List==>ArayList		
//ArrayList <String> myList = new ArrayList<>();
		List<String> myList2 = new ArrayList<>(); // <--better
		myList2.add("book");
		myList2.add("book");
		System.out.println(myList2);

//loop
		myList2.forEach(value -> {
			System.out.println(value);
		});

//or better
		myList2.forEach(System.out::println);

//size method
		System.out.println("List count = " + myList2.size());

//Set==>HashSet
//HashSet <String> mySet = new HashSet<>();
		Set<String> mySet2 = new HashSet<>(); // <--better
		mySet2.add("book");
		mySet2.add("book");
		System.out.println(mySet2);
		mySet2.forEach(System.out::println);
	}
}
