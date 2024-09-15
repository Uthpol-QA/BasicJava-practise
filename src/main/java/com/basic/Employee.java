package com.basic;

public class Employee {

	// dataType variableName = veriableValue ;

	String institute = "SmartTech";

	// global
	int salary = 5000;

	boolean isEligible = false;

	// public static void main(String[] args) {

	// local
	// int age = 50;

	// }

	// Access modifier(public, private)
	// return method (int)

	// name = static void
	static void name() {
		// code = employee name is Saiful
		System.out.println("employee name is Saiful");

	}

	// salary = void
	void salary() {
		// code = saiful salary is 5000
		System.out.println("saiful salary is 5000");
	}

	// main and call both method inside main
	public static void main(String[] args) {
		Employee.name();
		Employee obj = new Employee();
		obj.salary();

	}
}
