package com.class5;

import java.util.Scanner;

public class NestedIfPractice {
public static void main(String[] args) {
	
	/*
	 * check if user has credit card -->
	 * check what is the balance if balance is more than 1000-->pay off
	 * else"you are good"
	 */
	
	boolean creditCard=true;
	
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Let's check the balance");
	creditCard=scanner.nextBoolean();	
	if(creditCard) {
	//if(true) {Bunu yazdigimizda son else durumunu gormuyor	
	
		System.out.println("What is your balance");
		int balance=scanner.nextInt();
		
		if(balance>=1000) {
			System.out.println("pay off now");
		}else {
			System.out.println("you are safe");
		}	
  }else {
		System.out.println("Do you want a credit card");	
		}
	}
}

