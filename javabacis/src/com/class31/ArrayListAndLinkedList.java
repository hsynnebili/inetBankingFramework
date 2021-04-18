package com.class31;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {
		
		System.out.println("===========ArrayList=========");
		
		ArrayList<String> countries = new ArrayList<>();
		 
		countries.add("Canada");
		countries.add("USA");
		countries.add("Germany");
		countries.add(null);
		countries.add("Germany");
		countries.add("Italy ");
		countries.add(null);
		
		System.out.println(countries);
		
		
		System.out.println("===========LinkedList=========");
		
		LinkedList<String> capitals = new LinkedList<>();
		
		capitals.add("London");
		capitals.add("Berlin");
		capitals.add("Ottowa");
		capitals.add("Washington");
		capitals.add(null);
		capitals.add("London");
		capitals.add(null);
		
		System.out.println(capitals);
		
		
	}
}