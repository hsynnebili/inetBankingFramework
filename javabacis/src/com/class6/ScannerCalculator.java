package com.class6;

import java.util.Scanner;

public class ScannerCalculator {
	public static void main(String[] args) {

		/*
		 * double first, second, solution;
		 * 
		 * char operator;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter 2 numbers"); first = scanner.nextDouble(); second =
		 * scanner.nextDouble();
		 * 
		 * System.out.println("Enter(+,-,*,/): "); operator = scanner.next().charAt(0);
		 * 
		 * switch (operator) { case '+': solution = first + second; break; case '-':
		 * solution = first - second; break; case '*': solution = first * second; break;
		 * case '/': solution = first * second; break; default:
		 * System.out.println("Error"); return;
		 * 
		 * } System.out.println("Solution is " + solution);
		 */

		String firstName, secondName, thirdName, fourthName, name;
		char branch;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter four names ");
		firstName = scanner.nextLine();
		secondName = scanner.nextLine();
		thirdName = scanner.nextLine();
		fourthName = scanner.nextLine();

		System.out.println("Enter (A,B,C,D) ");
		branch = scanner.next().charAt(0);

		switch (branch) {
		case 'A':
			name = firstName;
			break;
		case 'B':
			name = secondName;
			break;
		case 'C':
			name = thirdName;
			break;
		case 'D':
			name = fourthName;
			break;
		default:
			System.out.println("Invalid");
			return;
			

		}
System.out.println(name+" is that branch");
	}
}
