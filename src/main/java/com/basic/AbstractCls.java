package com.basic;

public class AbstractCls {

	public static void main(String[] args) {

		AbstractCls.getLogin();
		int value = AbstractCls.getLogin();
		System.out.println(value);

		AbstractCls.getPayment();
		String name = AbstractCls.getPayment();
		System.out.println(name);
	}

	private static String getPayment() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int getLogin() {
		return 0;
		// TODO Auto-generated method stub

	}
}

//LoginFunction.getLogin();
//LoginFunction.getPayment();

//return  (best method)
//String name = LoginFunction.getPayment();
//System.out.println(name);