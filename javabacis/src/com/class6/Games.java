package com.class6;

import java.util.Scanner;

public class Games {
	public static void main(String[] args) {

		String name;
		String play;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a name");
		name = scanner.nextLine();

		switch (name) {
		case "Alex":
			play = "Football";
			break;
		case"Nadal":
			play="Tennis";
			break;
		case"Shumaer":
			play="Racing car";
			break;
		case "Tiger":
			play="Golf";
			break;
		case "Bryant":
			play="Basketball";
			break;
			default:
				play="Invalid";
				
		}
System.out.println(play);
	}
}
