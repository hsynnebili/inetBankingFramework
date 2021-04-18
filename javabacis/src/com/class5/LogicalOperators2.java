package com.class5;

import java.util.Scanner;

public class LogicalOperators2 {
public static void main(String[] args) {
	/*
	 * write a program to ask user enter daily sale amount
	 * based on the sales range commission will be different
	 * example:sales is <100==> commission =2
	 * sales more than 100 and less than 200=5
	 */
	int sales;
	int commission;

	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter sales amount");
	sales=scanner.nextInt();
	
	if(sales>0  && sales<100) {
		commission=2;
		
	}else if(sales>=100 && sales<200) {
		commission=5;
	}else if(sales>=200 && sales<500) {
		commission=10;
	}else if(sales>=500) {
		commission=20;
	}else {
		commission=0;
	}
	System.out.println("Your commission is: "+commission);
	}
}

