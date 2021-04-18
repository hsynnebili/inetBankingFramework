package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Prompt user to ask the name 3 times and print "You are doing great_____" */

		/*String name = null;
		int a = 1;

		Scanner scanner = new Scanner(System.in);

		while (a <=3) {
			System.out.println("Please enter your name");
			name = scanner.nextLine();
			
			
			a++;
		}
		System.out.println("You are doing great " + name);
	*/
		
		
		String name =null;
		int a = 1;

		Scanner scanner = new Scanner(System.in);

		while (a <=3) {
			System.out.println("Please enter your name");
			name = scanner.nextLine();
			
			System.out.println(name);
			a++;
		}
		System.out.println("You are doing great " +name);
	}

}
