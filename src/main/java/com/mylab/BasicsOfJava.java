package com.mylab;

public class BasicsOfJava { // class start
//primitive data
	int salary = 5000;
	long math = 1234567890;
	double coins = 3.1416;
	char number = 65;
	char asLetter = 'A';  //global variable
	boolean status = false;
	
//non-primitive data
	String asValues = "john321@*=+";

	static int x = 10;
	static int y = 9;

	public static void main(String[] args) { // methods start
// if-else use
		if (x>y) {
//			int a = 15;  //local variable
			
			System.out.println("is true");
		} else {
			System.out.println("is false");
			// This would run!
		}
//boolean use	
		boolean isJavaFun = true;
		System.out.println(isJavaFun);     // Outputs true
		
		boolean isFishTasty = false;
		System.out.println(isFishTasty);   // Outputs false

	} // methods end

} // class end
