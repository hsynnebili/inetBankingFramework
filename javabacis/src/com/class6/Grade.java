package com.class6;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {

		char grade;
		String gradeLevel;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade = scanner.nextLine().charAt(0);
//		System.out.println("A is excellent,B is Good,C is Average and D is Bad ");
		switch (grade) {
		case 'A':
			
			gradeLevel = "Excellent";

			break;
		case 'B':
			gradeLevel = "Good";
			break;

		case 'C':
			gradeLevel = "Average";
			break;

		case 'D':
			gradeLevel = "Bad";
			break;

		default:
			gradeLevel = "Unknown";

		}
		System.out.println("Your grade  is  "+gradeLevel);
	}
}
