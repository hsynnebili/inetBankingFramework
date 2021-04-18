package com.class6;

import java.util.Scanner;

public class SwitchLangg {
	public static void main(String[] args) {
		// Promp user to enter their country
		// Based on the country -->specify favorite food

		String country;
		String lan;//lan=language

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country = scanner.nextLine();

		switch (country) {

		case "USA":
			lan = "English";
			break;
		case "Germany":
			lan = "German";
			break;
		case "Russia":
			lan = "Russian";
			break;
		case "Italy":
			lan = "Italian";
			break;
		case "Turkey":
			lan = "Turkish";
			break;
		case "Spain":
			lan = "Spanish";
			break;
			default:
				lan="Unknown";
		}
		System.out.println("Your language  is  "+lan);
	}
}