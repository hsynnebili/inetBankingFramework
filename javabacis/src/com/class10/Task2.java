package com.class10;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
	
String item;
double price;
double payment;
double balance;
double totalPayment=0;

Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your item");
item=scanner.nextLine();

System.out.println("Please enter the item price");
price=scanner.nextDouble();

do {
	System.out.println("Please enter your payment amount");
	payment=scanner.nextDouble();
	
	totalPayment=totalPayment+payment;
	
	balance=price-totalPayment;
	System.out.println("Please enter more $ "+balance);
	}while(totalPayment<=price);
}
}