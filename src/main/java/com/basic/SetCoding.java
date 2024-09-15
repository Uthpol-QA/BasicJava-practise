package com.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetCoding {

	public static void main(String[] args) {
		//int [] a = {2,3,4,5,6,7};
		
		List<Integer> myList = new LinkedList <>();
		myList.add(10);	
		System.out.println(myList.size());
		
		
		Set <Integer> mySet = new HashSet <>();
		myList.add(20);
		System.out.println(mySet.size());
		
		
		Map <String,String> myMap = new HashMap <>();
		myMap.put("Salary", "500");	
		System.out.println("this is hashmap" +myMap);
		
	}	
}
