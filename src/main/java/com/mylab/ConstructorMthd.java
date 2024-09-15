package com.mylab;

public class ConstructorMthd {
	// using contractor , expert coding.
	String name;
	String address;
	int phoneNumber;
	double salary;

	public ConstructorMthd(String name, String address, int phoneNumber, double salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public void getData() {
		System.out.println("person name is = " + name);
		System.out.println("person name is = " + address);
		System.out.println("person name is = " + phoneNumber);
		System.out.println("person name is = " + salary);

	}

	public static void main(String[] args) {
		ConstructorMthd obj = new ConstructorMthd("john", "nyc", 123456789, 500.75);
		obj.getData();
	}
}
