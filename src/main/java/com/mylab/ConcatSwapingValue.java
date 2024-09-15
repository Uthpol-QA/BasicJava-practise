package com.mylab;

public class ConcatSwapingValue {

	String firstName = "john"; // --> here, String as literal
	String lastName = "daw"; // --> literal

	public void dataChange() {

//join String  --> concat() 
		System.out.println(firstName.concat(lastName));

//lateral  --> pool
		System.out.println(firstName); // --> no change
		System.out.println(lastName); // --> no change

//class    --> heap		
		StringBuffer objt = new StringBuffer("java");
		System.out.println("before append = " + objt); // java

//another way,
//join SB/SB  --> append()
		System.out.println("join = " + objt.append("python"));

//after result
		System.out.println("after append = " + objt); // java

	}

	public static void main(String[] args) {
		ConcatSwapingValue obj = new ConcatSwapingValue();
		obj.dataChange();

	}
}
