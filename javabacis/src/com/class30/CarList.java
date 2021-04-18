package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class CarList {
	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Honda");
		cars.add("Ferrari");
		cars.add("Mazda");
		cars.add("Nissan");

		System.out.println("-------1. way using for loop-------");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		System.out.println("---------2 way using advanced for loop--------");
		for (Object car : cars) {
			System.out.println(car);
		}

		System.out.println("------3 way using iterator--------");

		Iterator<String> it = cars.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------4 way using while loop-------");
		int c = 0;
		while (cars.size() > c) {
			String myCar = cars.get(c);
			System.out.println(myCar);
			c++;
		}

	}
}