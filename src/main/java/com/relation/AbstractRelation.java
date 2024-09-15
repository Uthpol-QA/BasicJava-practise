package com.relation;

//making inheritance with normal class
// after normal class --> add : extends clsNm, then --> add un-implement

public class AbstractRelation extends AbstractClass {

	@Override
	void getSalary() {
		// TODO Auto-generated method stub	
	}

	@Override
	void getNumber() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getName(String studentName) {
		// TODO Auto-generated method stub
		System.out.println("student name is " + studentName);
	}
}
