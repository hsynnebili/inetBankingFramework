package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		// "main" write, ctrl+space and press enter!!!(short way)
//take an number from a user and print that number

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Please enter any number"); int myNumber =
		 * scanner.nextInt();
		 * 
		 * System.out.println("The number you entered is " + myNumber);
		 */

		int old1= 38;

		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you");
		int old = scanner.nextInt();
		System.out.println("You are " + old + " years old");

	}
}
