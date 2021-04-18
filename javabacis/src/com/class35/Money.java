package com.class35;

public class Money {

	public static void main(String[] args) {
		try {
			withdraw(200, 300);
		} catch (ArithmeticException e) {
			System.out.println("Your balance is not enough");
		}
	}

	public static void withdraw(int balance, int amount) {

		if (balance > amount) {
			System.out.println("You can withdraw your money");

		} else {
			throw new ArithmeticException("Sorry your balance is not enough");
		}

	}
}
