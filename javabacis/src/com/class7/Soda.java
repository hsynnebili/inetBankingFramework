package com.class7;

import java.util.Scanner;

public class Soda {
	public static void main(String[] args) {
		/*
		 * Ask user to pay for a soda keep asking user to pay for soda until entered
		 * price is not equal to 1.99 after user got a right amount print
		 * "Please enjoy your soda"
		 */
		double price = 1;

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Pay for a soda");
			System.out.println(price);
			if (price != 2) {
				System.out.println("Please enjoy your soda");
				break;
			}
			price++;

		}
	}
}
