package com.class11;

public class Task1 {
public static void main(String[] args) {
	String[]cars= {"BMW","VW","Mercedes","Acura","Honda","Toyota"};
	for(int i=0; i<=cars.length-1;i++) {
		System.out.println(cars[i]);
	}
	System.out.println("------for each--------");
	
	for(String car:cars) {
		System.out.println(car);
		
		
	}
}
}
