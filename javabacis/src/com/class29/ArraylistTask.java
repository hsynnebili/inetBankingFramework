package com.class29;

import java.util.ArrayList;

public class ArraylistTask {
	public static void main(String[] args) {

		ArrayList<String> greetings = new ArrayList<String>();
		greetings.add("Nurbanu");
		greetings.add("Canada");
		greetings.add("Azerbaijan");
		greetings.add("England");
		greetings.add("God Damn it!");
		greetings.add("God bless you!");
		greetings.add("For Gods Sake");
		greetings.add("2" );

		if (!greetings.isEmpty()) {
			System.out.println("its not empty");

		} else {
			System.out.println("its empty");
		}
		if (greetings.contains("Canada")) {
			System.out.println("Canada is available");
		} else {
			System.out.println("Canada isnt available");
 
		}
		System.out.println(greetings.size());
	}
}
