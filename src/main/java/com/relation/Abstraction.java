package com.relation;

public abstract class Abstraction {

//abstraction means how much abstract methods can hide
//0%, 25% ,50%, 75% abstraction possible in abstract class
//absteact class can handle abstract + non-abstract methods
	
//abstract methods	
		abstract void run();
		abstract void sleep();
		abstract void eat();
		
//non-abstract methods		
		void jump() {
			System.out.println("jumping");
		}	
}
