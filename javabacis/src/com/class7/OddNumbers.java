package com.class7;

public class OddNumbers {
public static void main(String[] args) {
	
	/*print only odd numbers from 1 to 20*/
	
	/*
	 int num=1;
	 
	 
	while(num<=20) {
		
		System.out.println("print only odd numbers from 1 to 20 "+num);
		//3%2=1
		//if(num%2!=0) {
	    //System.out.println(num);
		num+=2;
		}
		*/
	
	int num=1;
	
	while(num<=20) {
		
		//num+=2;
		
		if(num%2!=0) {
			System.out.println(num);
		}
	
		num+=3;
		
	}
}
}
