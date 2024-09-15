package com.special;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinValue {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(3);
		list.add(11);
		list.add(15);
		list.add(18);
		list.add(30);

		int max = Collections.max(list);
		System.out.println("max value is ="+ max);
		int min = Collections.min(list);
		System.out.println("min value is ="+ min);
	}

}
