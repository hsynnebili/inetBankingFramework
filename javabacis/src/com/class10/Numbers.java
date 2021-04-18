package com.class10;

import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
	final int size=10;
	
	int[]numbers=new int[size];
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter "+size+" numbers. ");
	

	for(int i=0; i<size; i++) {
		System.out.println(numbers[i]);
	}
	
}
}
