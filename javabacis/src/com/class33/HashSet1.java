package com.class33;

import java.util.Map.*;
import java.util.*;
//import java.util.HashMap;

public class HashSet1 {
	public static void main(String[] args) {

//		Set<String> countries = new TreeSet<>();
//		countries.add("India");
//		countries.add("Australia");
//		countries.add("South Africa");
//		countries.add("India");
//		countries.add("America");
//		countries.add("America");
//		System.out.println(countries);
//
//		Set<String> numbers = new LinkedHashSet<>();
//		numbers.add("third");
//		numbers.add("first");
//		numbers.add("second");
//		System.out.println("My HashSet content: " + numbers);
//
//		numbers.clear();
//		System.out.println("Clearing HashSet:");
//		System.out.println("Content After clear:" + numbers);
//
//		Map<String, Integer> values = new HashMap<>();
//		values.put("FIVE", 5);
//		values.put("ONE", 1);
//		values.put("FOUR", 4);
//		values.put("TWO", 2);
//		values.put("THREE", 3);
//
//		System.out.println(values);
//
//		Map<String, Integer> number = new HashMap<>();
//		number.put("FIVE", 5);
//		number.put("ONE", 1);
//		number.put("FOUR", 4);
//		number.put("TWO", 2);
//		number.put("THREE", 3);
//
//		Set<String> keys = number.keySet();
//		for (String key : keys) {
//			System.out.println(key);

		Map<String, Integer> person = new HashMap<>();
		person.put("Shiva", 222);
		person.put("Sandish", 333);
		person.put("Asel", 555);
		person.put("Sumair", 666);

		Set<String> persons = person.keySet();
		Iterator<String> it = persons.iterator();
		while (it.hasNext()) {
//			String k = it.next();
//			System.out.println(k);
			System.out.println(it.next());
		}

	}

}
