package com.class3;

public class Relationaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 198;
		int b = 50;

		boolean result = a > b;
		boolean result1 = a == b;

		System.out.println(result);
		System.out.println(result1);

		// compare 2 numbers and if a is larger than b-->print

		if (a > b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("b is larger than a");
		}

		if (a == b) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}

		if (a != b) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		
		}

	// declare price and if price is higher than expected price==>I will not

	double shoesPrice=32.99;

	double allowedPrice=31.99;

	if(shoesPrice<=allowedPrice) {
		System.out.println("I am buying those shooes");
	}else{
	
		System.out.println("I am buying Not buy those shooes");
	}
	
System.out.println("I am continues code");






	
	
}
}
