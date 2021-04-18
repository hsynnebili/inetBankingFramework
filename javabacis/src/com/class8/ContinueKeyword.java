package com.class8;

public class ContinueKeyword {
	public static void main(String[] args) {

		for (int i = 0; i <= 6; i++) {
			if (i == 2 || i == 3 || i == 5) {
				continue;
			}

			System.out.println(i);
		}
		
		//I want to print number from 1 to 20 but skip those that divisible by 3
		
		for(int k=1;  k<=20;  k++) {
			if(k%3==0) {
				continue;
			}
			System.out.println("k:"+k);
		}
	}
}