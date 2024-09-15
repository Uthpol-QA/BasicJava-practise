package com.mylab;

public class ConcateProblemString {

	public static void main(String[] args) {

// adding name is not possible here
//because, String is immutable, store in both Heap and Pool		

		String name = "pol";
		name.concat("nath");
		System.out.println(name);

		String obj = new String("pol");
		obj.concat("nath");
		System.out.println(obj);

//to solve this, 1.String buffer & 2.String builder came
//		--> has Append(); -->mutable

		StringBuffer obj2 = new StringBuffer("pol");
		obj2.append("nath");
		System.out.println(obj2);
	}
}