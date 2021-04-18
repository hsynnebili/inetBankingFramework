package com.class11;

import java.util.Scanner;

public class Reserve {
public static void main(String[] args) {
	
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter 5 elements");
	  int[]element=new int[5];
	  

	  for(int i=0; i<element.length;i++){
	    element[i]=scanner.nextInt();
	    
	   }
	   System.out.println();
	   for (int i = element.length-1; i >= 0; i--) {
	   System.out.print(element[i] + " ");
	
}
}
}