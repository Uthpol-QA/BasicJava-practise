package com.basic;

public class ExceptionInJava {

	public static void main(String[] args) {

		try {
			
			Thread.sleep(3000);  //exception
			
		} catch (InterruptedException i) {
			//handle exception
		}

		catch (Exception e) {
			// solving exception, no throwing
		} finally {

		}

	}
}
