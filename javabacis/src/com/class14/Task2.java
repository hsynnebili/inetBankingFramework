package com.class14;

public class Task2 {
	public static void main(String[] args) {

		String str = "12 Hello !@#$%^&* 123445 Array";
		String reverse = " ";
		String newstr = str.replaceAll("[A-Za-z]", "");
		System.out.println("There are " + newstr.length() + " alpha characters in the String");

		String str1 = "Is it saturday!is it raining!Do we have a Java Class today?";
		String[] array = str1.split("!!?");
		System.out.println("The length of the array is " + array.length);

		for (int i = str.length(); i > 0; i--) {

			reverse = reverse + str.substring(i - 1, i);
		}
		System.out.println("Reversed String is: " + reverse);

	}
}
