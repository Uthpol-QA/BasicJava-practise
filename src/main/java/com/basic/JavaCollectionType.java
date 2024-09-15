package com.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class JavaCollectionType {

	int a = 10;
	int[] age = { 20, 30, 40 };

// 1st way: wrapper class + non primitive work

	ArrayList<String> obj = new ArrayList<>();
	ArrayList<Integer> obj2 = new ArrayList<>();
	ArrayList<Double> obj3 = new ArrayList<>();
	ArrayList<Boolean> obj4 = new ArrayList<>();
	ArrayList<Long> myArraylist = new ArrayList<>();
	LinkedList<String> myLinklist = new LinkedList<>();
	Vector<String> myVector = new Vector<>();
	Stack<String> myStack = new Stack<>();

	// 2nd way: best way
	// up casting: int obj = new class();

	List<Integer> myList = new ArrayList<>();

	public static void main(String[] args) {

	}
}
