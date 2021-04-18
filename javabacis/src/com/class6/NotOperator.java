package com.class6;

import java.util.Scanner;

public class NotOperator {
	private static Scanner scanner;

	public static void main(String[] args) {

		/*
		 * Write a program to find the largest of three double values if-else. If
		 * provided by a user (numbers must be distinct)
		 * 
		 * 
		 * double num1, num2, num3;
		 * 
		 * Scanner scan=new Scanner (System.in);
		 * System.out.println("Provide 3 double values"); num1=scan.nextDouble();
		 * num2=scan.nextDouble(); num3=scan.nextDouble();
		 * 
		 * if (num1>num2 && num1>num3) { System.out.println(num1+ "is the largest");
		 * }else if (num2>num1 && num2>num3) { System.out.println(num2+
		 * "is the largest"); }else if (num3>num1 && num3>num2) {
		 * System.out.println(num3+ "is the largest"); }
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * double num1, num2, num3;
		 * 
		 * Scanner scan=new Scanner (System.in);
		 * System.out.println("Provide 3 double values"); num1=scan.nextDouble();
		 * num2=scan.nextDouble(); num3=scan.nextDouble();
		 * 
		 * if (num1>num2 && num1>num3) { System.out.println(num1+ "is the largest");
		 * }else if (num2>num1 && num2>num3) { System.out.println(num2+
		 * "is the largest"); }else if (num3>num1 && num3>num2) {
		 * System.out.println(num3+ "is the largest"); }
		 * 
		 */

		double temp1, temp2, temp3;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter three temperature values");
		temp1 = scanner.nextDouble();
		temp2 = scanner.nextDouble();
		temp3 = scanner.nextDouble();

		if (temp1 > temp2 && temp2 < temp3) {
			System.out.println(temp1 + " is the bigest value");

		} else if (temp2 > temp3 && temp3 > temp1) {
			System.out.println(temp2 + "is the bigest value");
		} else if (temp3 > temp2 && temp2 > temp1) {
			System.out.println(temp3 + "is the bigest value");
		}

	}
}