package com.class8;

import java.util.Scanner;

public class RangeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//let user define a range of numbers to print

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int startNumber = scanner.nextInt();
		System.out.println("Please enter ending number");
		int endNumber = scanner.nextInt();

		if (startNumber < endNumber) {

			for (int i = startNumber; i <= endNumber; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("I won't run your code");
		}

	}
}