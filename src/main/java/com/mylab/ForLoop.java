package com.mylab;

public class ForLoop {

// here, i means = Iterator (who is repeating); ++ means = +1 (changing possible like +2)
// types: 1.basic forLoop, 2.Enhance forLoop, 3.latest forEach loop, 4.while loop, 5.Do while loop, 6.Iterator
// positive for loop: for(start; end; ++) --> for (int i=0; i<=100; i++)  =Incremental
// negative for loop: for(end; start; --) --> for (int i=100; i>=0; i--)  =decrement
// Infinity loop = no end point : --> for (int i=0; ; i++) -->int(;;);
// to stop infinity Loop ---> system.exit();

//loop   --> using for loop
	public static void main(String[] args) {

// print 0-10 by using positive for loop
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

// print 5-0 reversely by using negative for loop
		for (int x = 5; x >= 0; x--) {
			System.out.print(x + "abc");
		}
	}
}
