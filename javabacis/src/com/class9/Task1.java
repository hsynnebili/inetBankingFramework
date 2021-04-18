package com.class9;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  first number");
		int a = scanner.nextInt();
		System.out.println("Enter second number ");
		int b = scanner.nextInt();
		for (int i = a; i < b; i++) {
			if (i % 2 == 0) {

				sumEven += i;
			} else {
				sumOdd += i;
			}

		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
}
