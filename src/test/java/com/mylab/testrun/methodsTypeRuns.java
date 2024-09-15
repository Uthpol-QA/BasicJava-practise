package com.mylab.testrun;

import com.mylab.MethodsType;

public class methodsTypeRuns {

	public static void main(String[] args) {
		
//different pakage calling : static			
		MethodsType.sleep();
		
//different pakage calling : non-static : creating object	
		MethodsType obj =new MethodsType();
		obj.run();
		
	}	
	
}