package com.basic;

public class ConditionJava {

//		1.	Age <1  baby  False
//		2.	Age <10 & >2  kids  False
//		3.	Age > 18 & <65  Adult  False
//		4.	Age> 65  senior citizen True

	public void getJavaCondition(int age) {// age= 8
		// condition = 4 ==> connect>> else if
		// nothing true==> else (last)= no parenthesis
		if (age < 1) {
			System.out.println("This is baby");
		} else if (age < 10 && age > 2) {
			System.out.println("This is Kids");
		} else if (age > 18 && age < 65) {// true
			System.out.println("This is Adult");
		} else if (age > 65) {
			System.out.println("This is Adult");
		} else {
			System.out.println("Age not found");// here
		}

	}

	public static void main(String[] args) {
		ConditionJava obj = new ConditionJava();
		obj.getJavaCondition(25);
	}

}
