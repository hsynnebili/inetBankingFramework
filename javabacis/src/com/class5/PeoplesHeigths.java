package com.class5;

import java.util.Scanner;

public class PeoplesHeigths {
public static void main(String[] args) {
	

	
	
	Scanner inc=new Scanner(System.in);
	System.out.println("Please enter your height in inches: ");
	double height=inc.nextDouble();
	
	
	if(height==5 && height <6 ) {
		System.out.println("Short");
	}else if(height==5  && height<6) {
		System.out.println("Medium");
	}else if(height>=6) {
		System.out.println("Tall");
	}else {
		System.out.println("Please enter valid height");
	}
	
	
	
	
		
		
	}
}
