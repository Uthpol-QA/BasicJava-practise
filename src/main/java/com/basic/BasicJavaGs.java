package com.basic;

public class BasicJavaGs {
	// method => it's piece of code.
	// based void keyword => 1. void method 2. non-void/return method
	// void/dataType methodName() {} ==> mandatory
	// void method => method with void keyword. void not return anything
	// non void/return => method without void keyword. non-void/return always return
	// something.
	// based on static keyword => 1. static method 2. non static method
	// static => method with static keyword. no need to create object.
	// ClassName.staticMethodName()
	// non static => method without static keyword. to access this method, we need
	// to create a object first. obj.method()
	// if we want to access the method => that time, we need to see one keyword =>
	// static
	// based on parameter => 1. parameterized method 2. non-parameterized method
	// parameterized method => method with parameter.
	// non-parameterized method => method with parameter.

	static void sayGreeting(String msg) {
		System.out.println(msg);
	}

	void getSalary() {
		System.out.println(10000);
	}

	String getName() {
		return "John Doe";
	}

	public static void main(String[] args) {
		BasicJavaGs.sayGreeting("Good Night");

		// create obj => BasicJava obj = new BasicJava();
		BasicJavaGs obj = new BasicJavaGs();
		obj.getSalary();

		System.out.println(obj.getName());
	}
}
