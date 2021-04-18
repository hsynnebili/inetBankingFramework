package com.class8;

public class Sum {
	public static void main(String[] args) {

		/*
		 * int sum=0;
		 * 
		 * 
		 * for(int i=1; i<=5; i++) { 
		 * sum=sum+i; 
		 * } 
		 * System.out.println(sum);//
		 * 
		 */
		/* find sum of all even numbers from 1 to 100 */

		
		/*
		int sum1 = 0;

		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0) 

				sum1 = sum1 + j;

			}
			System.out.println(sum1);
			*/
		
		int sum2=0;
		for(int l=0; l<=95; l++) {
			if(l%5==0) 
				sum2=sum2+l;
				
			}
			System.out.println("0'dan 95'e kadar olan sayilarin 5'in katlari olanlarinin toplami: "+sum2  );
		}
	}

	
