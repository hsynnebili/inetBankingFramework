package com.class9;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		int sum = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the item you want to buy");
		String item = scan.nextLine();
		
		System.out.println("Enter the price for the item");
		int price = scan.nextInt();//50

		do {
			System.out.println("Now please pay for your item");
			int pay= scan.nextInt();//30;20
			sum = sum+pay;//0=0+30=30+20=50
			
			System.out.println((price - sum) + " is left to pay off the amount");//20;0

		} while (sum < price) ;//30<50;50!<50(dongu bitti)
		System.out.println("Thank you for shopping with us");

	}

}
