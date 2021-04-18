package com.class11;

public class Foods {
public static void main(String[] args) {
	String[][] food= {//3,4
			{"burger","fries","hot dog","meatloaf"},
			{"lo mein","fried rice"},
			{"biriyani","korma","naan","chick peas"}
	};
	
	for(int i=0; i<food.length; i++) {
		for(int j=0; j<food[i].length; j++) {
			System.out.println(food[i][j]+" ");
		}
		System.out.println();
	}
			

}

}
