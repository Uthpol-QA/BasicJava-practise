package com.basic;

public class ImmutableStng {

	public static void main(String[] args) {

		String name = new String("java");
		name.concat("python"); //add two name together
		System.out.println(name);

		StringBuffer person = new StringBuffer("java");
		person.append("coding");
		System.out.println(person.toString());

	}
}
