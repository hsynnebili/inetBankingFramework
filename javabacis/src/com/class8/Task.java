package com.class8;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 1; a <= 100; a++) {
			System.out.println("a= " + a);
		}
		for (int b = 100; b >= 1; b--) {
			System.out.println("b= " + b);
		}
		for (int c = 1; c <= 20; c += 2) {
			System.out.println("c= " + c);

		}
		for (int d = 20; d >= 1; d--) {
			if (d % 2 == 0) {
				System.out.println("d= " + d);
			}
			for (int e = 20; e <= 50; e++) {
				if (e % 2 != 0) {
					System.out.println("e= " + e);
				}
			}
			for (int f = 50; f >= 20; f--) {
				if (f % 2 != 0) {
				}
				System.out.println("f= " + f);
			}
		}
	}
}
