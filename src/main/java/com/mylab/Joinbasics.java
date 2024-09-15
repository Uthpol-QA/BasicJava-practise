package com.mylab;

public class Joinbasics {

	static String city = "Astoria";
	static int zip = 11103;

	public static void getData() {
//old java-->		
		System.out.println("old java--> cityName = " + city); // old java = +
		System.out.println("old java--> zipCode = " + zip); // old join = +
//java5-->
		System.out.println("java5-->next cityName = ".concat(city));
//java7-->
		System.out.printf("%s\n%s", city, zip);
	}

	public static void main(String[] args) {

		Joinbasics.getData();
	}
}
