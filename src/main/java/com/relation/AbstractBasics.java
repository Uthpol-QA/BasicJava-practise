package com.relation;

public abstract class AbstractBasics {

// abstract class can handle abstrsct + non-abstract method both	
// abstract methods must be non-static

//creating abstract methods
	public abstract void getvalue();

//creating non-abstract / normal methods
	public static void getNumber() {
	}

	public static void main(String[] args) {
//calling normal mthd
		AbstractBasics.getNumber();

//calling abstract mthd not possible

// creating obj means instantiation : abstract cls instantiation not possible
//only possible when: create another cls, then make relation with that cls
// inharitance with normal cls - add unimplements method,
// override all abstract methods, then create object from normal class

	}
}