package com.basic;

import java.util.HashMap;
import java.util.Map;

public class MapCoding {

	public static void main(String[] args) {		
		//Map ==> Key : Value = Salary = 5000
				Map<String,Integer> myMap = new HashMap<> ();
		myMap.put("Salary", 5000);
		myMap.put("age", 50);
		myMap.put("cell", 1234567);
		
		// myMap.put("name", jack);  <== not work
		//print
				System.out.println(myMap);
				
		//size
				System.out.println(myMap.size());
					
		//find
				System.out.println(myMap.get("age")); //by keyName
					
		//Loop best and mandatory
				myMap.forEach((k,v)->{
					System.out.println(k);
					System.out.println(v);
				});
		//older way loop ==> not mandatory	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
