package com.class4;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
/*
	int amount=225000;
	Scanner scanner=new Scanner(System.in);
	System.out.println("How much the amount of the loan");
	amount=scanner.nextInt();
	if(amount<200000) {
		System.out.println("Accepted");
	}else {
		System.out.println("Rejected");
	}
*/
	/*
	int age=16;
	Scanner scanner=new Scanner(System.in);
	System.out.println("How old the customer's age");
	age=scanner.nextInt();
	if(age>=18) {
		System.out.println("I will issue a driver licence to you");
	}else {
		System.out.println("You will get a learners permit");
	*/
	
	int weight=87;
	int kg=87;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("What is your weight");
	weight=scanner.nextInt();
	double convertedWeight=(kg * 2.2046);
	System.out.println("Your weight is "+convertedWeight);
	if(convertedWeight>180) {
		System.out.println("You are so fat");
		
	}else {
		System.out.println("Your weight is eligible for you");
		
		
	}
	
		
	}
	}



