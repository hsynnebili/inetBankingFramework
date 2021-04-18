package com.class26;

public class PrivateMethodCalling {
	private void fun() {
		System.out.println("private m1 method");
	}

	private void fun(String a) {
		System.out.println("private m1 method with int parameter");
	}

	public static void main(String[] args) {
		PrivateMethodCalling obj = new PrivateMethodCalling();
		obj.fun();
		
		PrivateMethodCalling obj1 = new PrivateMethodCalling();
		obj1.fun("Hello");
	}
}
