package com.class11;

public class Cars {
public static void main(String[] args) {
	String[][]cars= {
			{"Ford","GMC","Chevrolet","Cadillac"},
			{"BMW","VW","Mercedes","Skoda","Opel","Audi"},
			{"Ferrari","Maserati","Lamborgini","Fiat"},
			{"Hundai","Kia","Mitshubusi"}
	};
	
	for(int i=0; i<cars.length; i++) {
		for(int j=0; j<cars[i].length; j++) {
			System.out.println(cars[i][j]);
		}
		System.out.println();
	}
}
}
