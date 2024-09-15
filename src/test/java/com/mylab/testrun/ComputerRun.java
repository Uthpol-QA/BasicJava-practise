package com.mylab.testrun;

import com.relation.Computer;

//open --> computer,moue keyboard
//inharitance , impliments,
//interface method, advance lvl

public class ComputerRun {

	public static void main(String[] args) {

		Computer object = new Computer();
		object.getName("LogiTech");
		object.getBrand();
		object.getModel();
		object.getSerial(153467);
	}

}
