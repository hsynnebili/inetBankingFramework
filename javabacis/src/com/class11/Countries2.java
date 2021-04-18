package com.class11;

public class Countries2 {
public static void main(String[] args) {
	String [][]countries= {
			{"USA","Canada","Mexico","Cuba","Costa Rica"},
			{"Argentina","Brasil","Colombia","Ecuador"},
			{"England","Turkey","France","Russia","Germany"},
			{"China","Japon","India","Tanzania"},
			{"Nigeria","South Africa","Egypt"}
	};
	
	for(int i=0; i<countries.length; i++) {
		for(int j=0; j<countries[i].length; j++) {
			System.out.println(countries[i][j]);
		}
		System.out.println();
	}
}
}
