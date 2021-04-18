package com.class8;

import java.util.Scanner;

public class ForAndScanner {
	public static void main(String[] args) {

		/*
		 * prompt user to enter 2 integers and compare At the end print largest
		 */

		int num1, num2;
		int largest = 1;
		for (int i = 1; i <= 5; i++) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter first number");
			num1 = scanner.nextInt();

			System.out.println("Please enter second number");
			num2 = scanner.nextInt();

			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num1) {
				largest = num2;

			} else {
				
				System.out.println(num1 + " is equal to" + num2);
				if(num1>largest) {
					largest = num1;
				}
			}
			System.out.println(largest + " is the largest");

		}
	}
}