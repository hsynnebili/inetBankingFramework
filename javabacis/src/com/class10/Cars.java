package com.class10;

public class Cars {
	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "Vw", "Toyota" };
		for (int i = 0; i <= cars.length - 1; i++) {
			System.out.println(cars[i]);
		}
		System.out.println(cars[3]);
		
		System.out.println("----------------------");
		
		String[] cars1 = new String[6 ];

		cars1[0] = "Volvo";
		cars1[1] = "BMW";
		cars1[2] = "Ford";
		cars1[3] = "Mazda";
		cars1[4] = "Vw";
		cars1[5] = "Toyota";
		for(int i=0; i<=cars.length-1; i++) {
		System.out.println(cars1[i]);
	}

}
}