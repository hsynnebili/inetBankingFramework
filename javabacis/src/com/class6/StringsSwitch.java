package com.class6;

import java.util.Scanner;

public class StringsSwitch {
	public static void main(String[] args) {
		// Promp user to enter their country
		// Based on the country -->specify favorite food

		String country;
		String favoriteFood;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country = scanner.nextLine();

		switch (country) {

		case "USA":
			favoriteFood = "Burger";
			break;
		case "Afghanistan":
			favoriteFood = "Palau";
			break;
		case "Russia":
			favoriteFood = "Pelmeni";
			break;
		case "Italy":
			favoriteFood = "Pasta";
			break;
		case "Turkey":
			favoriteFood = "Baklava";
			break;
		case "Morocco":
			favoriteFood = "Couscous";
			break;
			default:
				favoriteFood="Unknown";
		}
		System.out.println("Your favorite food is "+favoriteFood);
	}
}