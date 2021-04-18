package com.class9;

public class NestedLoops {
	public static void main(String[] args) {
//  for (int i=0; i<=5; i++) {
//  System.out.print(i);
//}

		/*
		 * I want to print pattern 123456789 -->rows =5, columns=9 123456789 123456789
		 * 123456789 123456789
		 * 
		 * 
		 * for (int i=1; i<=6; i++) {
		 * 
		 * for (int y=1; y<=9; y++) {
		 * 
		 * System.out.print(y);//12345 } System.out.println(); }
		 */

		/*
		 * I want to print pattern ***** ***** ***** *****
		 */

		/*
		 * for(int a=0; a<6; a++) { for(int b=0; b<6; b++) { System.out.print("*");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */

		/*
		 * for(int i=0; i<=5; i++) { for(int a=0; a<=6; a+=2) { System.out.print("a =" +
		 * a + ", ");
		 * 
		 * } System.out.println(); }
		 */

		/*
		 * for (int i = 0; i <=4; i++) { for (int k =0; k<i; k++) {
		 * 
		 * 
		 * System.out.print("*");
		 * 
		 * } System.out.println(); }
		 * 
		 */
		
		for (int i = 1; i <= 6; i++) {

			for (int y = 1; y <= 6; y++) {
				if (i== 3 || y == 1 || y == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}