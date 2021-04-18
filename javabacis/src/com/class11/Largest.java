package com.class11;

public class Largest {
public static void main(String[] args) {
	
	int[]numbers= {180,185,14,150};
	int largest=numbers[0];
	
	for(int i=0; i<=numbers.length-1; i++) {
		if(numbers[i]>largest) {
			largest=numbers[i];
			
		}
		
	}
	
		
	
		System.out.println("The largest number is "+largest);
	}
}
