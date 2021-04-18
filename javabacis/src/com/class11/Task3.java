package com.class11;

public class Task3 {
public static void main(String[] args) {
	int sum=1;
	
	
	
	int[]integers= {12,13,14,15,16,17,18};
	for(int i=0; i<=integers.length-1; i++) {
		
		sum+=integers[i];
		
		
	}
	System.out.println(sum);
	
	
	/*
	int[]integers= {12,13,14,15,16,17,18};
	for(int num:integers) {
		 sum=sum+num;
		}
	System.out.println(sum);
	*/
}}
