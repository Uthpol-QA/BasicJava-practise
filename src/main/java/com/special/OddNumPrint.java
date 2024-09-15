package com.special;

public class OddNumPrint {

//print odd number from 1 - 30
	
	public static void printOddNums() {
			for (int i = 1; i <= 30; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		}
	public static void main(String[] args) {
		OddNumPrint.printOddNums();
	}
}
