package com.class12;

public class LargestNumber {
public static void main(String[] args) {
	int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,12}
		};
	int maxI=0;
	int maxJ=0;
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			if(a[i][j]>a[maxI][maxJ]) {
				maxI=i;
				maxJ=j;
			}
		}
	}
	System.out.println(a[maxI][maxJ]);
}
}
