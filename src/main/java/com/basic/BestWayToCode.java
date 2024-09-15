package com.basic;

public class BestWayToCode {

	int numberCount = 10; // global

	void bestWayCode() { // start
		// int a = 20 ; //local

		System.out.println(numberCount);
	} // end

	public static void main(String[] args) {
		// ========> good coding
		BestWayToCode obj = new BestWayToCode();
		obj.bestWayCode();

	}

}
