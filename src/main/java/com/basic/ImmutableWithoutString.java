package com.basic;

public class ImmutableWithoutString {

	public final class Person {

		private final String name;
		private final int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {
//not possible --> string is immutable

//		Person obj = new Person("SAM", 12);
//		System.out.println(obj);
	}
}
