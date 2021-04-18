package com.class6;

import java.util.Scanner;

public class Capitals {
	public static void main(String[] args) {

		String country;
		String capital;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a country");
		country = scanner.nextLine();

		switch (country) {

		case "Turkey":
			capital = "Ankara";
			break;

		case "England":
			capital = "London";
			break;
		case "Germany":
			capital = "Berlin";
			break;

		case "Brazil":
			capital = "Sao Poulo";
			break;
		case "Russia":
			capital="Moscow";
			break;
			default:
				capital="Invalid";
				

		}
System.out.println(capital);
	}

}
