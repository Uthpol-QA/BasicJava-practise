package com.mylab;

public class MethodsType {

//	  static String name;  //Global, Class lel, static variable	
//static variable : access within project - any pakage,any cls,any method
//--------------------------------------------------		
//    String roadNames;    //Instance variable
//Instance variable : acess within class - any non-static method
//---------------------------------------------------

//void : return nothing ; use syso to see result
	public void run() {
	}

//static : no need object creation
	public static void sleep() {
		System.out.println("sleep");
	}

//non-void : need return type
//non-static : need object creation
	int number() {
		return 0;
	}

//java main methods : only this can run code
	public static void main(String[] args) {

//Rules for calling a method:
//-----------------------------------------------		
//if pkgNm different : test method need to be public access modifier		
//if main method is static : variable also need to be static
// -----------------------------------------------
// public class  --> can access from any pakage
// static        --> no need to create obj
// void          --> return nothing
// String[] args --> method parameter
// why array[]   --> can pass any parameter value
//-------------------------------------------------

//if static : clsNm.mthNm ();
//-------------------------------------------------
//if non-static :
//	first, creating object --> clsNm obj = new clsNm();
//  then,                  -->		obj.mthdNm();     <-- import(ctrl+shift+o)

// obj means clint, ie- dog,human,person,item etc
//-------------------------------------------------
//calling static methods
		MethodsType.sleep();

//calling non-static

		MethodsType obj = new MethodsType();
		obj.run();

	}
}