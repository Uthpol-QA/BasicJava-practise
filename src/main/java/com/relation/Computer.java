package com.relation;

public class Computer implements Keyboard, Mouse {

	@Override
	public void getBrand() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getModel() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void getSerial(int serial) {

		System.out.println("Mouse serial is " + serial);	
	}

	@Override
	public void getName(String name) {

		System.out.println("Keyboard name is " + name);
	}

}
