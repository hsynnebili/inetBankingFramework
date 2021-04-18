package com.class5;

import java.util.Scanner;

public class LogicalAnd {
	public static void main(String[] args) {

		/*
		 * Ask user to enter age and based on the age we will print:
		 * if age is less than 1 -->"Are you sure you are exist" 
		 * if age is older than 1 but less then 3-->baby
		 *  if age is older than 3 but less then 5-->toodler
		 * if age is older than 5 but less then 13-->kid
		 * if age is older than 13 but less then 20-->teenager
		 * if age is older than 20  but less then 60-->adult
		 * if age is older or equal to 64-->senior
		 */
		
		Scanner myScanner;
		int age;
		
		myScanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=myScanner.nextInt();
		
		if(age<=0){
			System.out.println("Are you sure you are exist");
		
		}else if(age>0 && age<3) {
			System.out.println("You are a baby");
		}else if(age>3 && age<5) {
			System.out.println("You are a  toodler");
		}else if(age>5 && age<13) {
			System.out.println("You are a  kid");
		}else if(age>13 && age<20) {
			System.out.println("You are a teenager");
		}else if(age>20 && age<64) {
			System.out.println("You are adult");
	}else {
		System.out.println("You are a senior ");
		
		}
		
	}
}
