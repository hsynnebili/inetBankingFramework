package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class DrinksReplace {
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("apple juice");
		drinks.add("lemonate");
		drinks.add("soda");
		drinks.add("tea");

		Iterator<String> it = drinks.iterator();

		for (int i = 0; i < drinks.size(); i++) {
			String drink = drinks.get(i);
			if (drink.contains("a") || drink.contains("e")) {
				drinks.set(i, "water");

			}

		}
		System.out.println(drinks);
	}
}