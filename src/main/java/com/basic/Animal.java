package com.basic;

public class Animal {

	void run() {// non static ==> need to create object >> objectName.MethodName()
		System.out.println("Animal Run");
	}

	static void sleep() {// static ==> ClassName.MethodName()
		System.out.println("Animal Sleep");
	}

	public static void main(String[] args) {// main = void + static
		Animal.sleep();
		
		
		// how to create object ==> ClassName objectName = new ClassName();
		Animal dog = new Animal();
		dog.run();
	}

}
