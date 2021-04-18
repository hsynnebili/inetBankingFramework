package com.class9;

public class StarPyramid {
public static void main(String[] args) {
	for (int a = 1; a <= 8; a++) {

		for (int b = 1; b <= a; b++) {
			System.out.print("*");// b=1
			
		}
		System.out.println(" ");
	}
	for (int c = 8; c >= 1; c--) {
		for (int d = 1; d <= c; d++) {
			System.out.print("*");// b=1
		}

		System.out.println(" ");// a=1,b=2
	}

}
}

