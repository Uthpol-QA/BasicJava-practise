package com.mylab.testrun;

import com.special.MathExpert;

public class MathExpertRun {
	public static void main(String[] args) {

		MathExpert obj = new MathExpert(10, 20);

		MathExpert.sum();
		obj.minus();
		MathExpert.divide();
		obj.multiply();

	}
}
