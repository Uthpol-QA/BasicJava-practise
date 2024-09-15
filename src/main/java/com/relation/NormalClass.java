package com.relation;

public class NormalClass {

	char grade = 'C';
	int roll = 10;
	double marks = 7.25;
	boolean status = false;
	String name = "mike";

	public void student() {
		System.out.println("Computer lab student profile:");
	}

	public void getdata() {
		System.out.println("student grade is = " + grade);
		System.out.println("student name is = " + name);
		System.out.println("student roll is = " + roll);
		System.out.println("student marks is = " + marks);
		System.out.println("student status is = " + status);

	}

	public static void main(String[] args) {
		NormalClass obj = new NormalClass();
		obj.student();
		obj.getdata();

	}
}
