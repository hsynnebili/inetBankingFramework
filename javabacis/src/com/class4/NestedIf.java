package com.class4;

public class NestedIf {
	/*
	 * wrie a program to check work eligibility
	 * if user is younger than<16-->not allowed to work
	 * otherwise -->allow to work.If user is younger than 64-->go to work 
	 * otherwise-->enjoy your life
	 */
	
public static void main(String[] args) {
	
	int age = 65;
	int eligibleAge=16;
	int retirementAge=64;
	
	if(age<eligibleAge) {
		System.out.println("You are too young,no work for you");
	}else {
		System.out.println("You are eligible at work");
		if(age<retirementAge) {
			System.out.println("Go work hard");
		}else {
			System.out.println("Please enjoy your life.You do Not to work ");
		}
		
			
		}
				
	}
}

