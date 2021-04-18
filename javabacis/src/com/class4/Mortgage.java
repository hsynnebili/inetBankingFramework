package com.class4;

public class Mortgage {
public static void main(String[] args) {
	
	
	double mortgageRate=4.5;
	double mortgagePrice=190000;
	
	if(mortgageRate>4.5) {
		System.out.println("User will not buy the house");
	   }else { 
		System.out.println("User will consider  buying  the house");
	    if(mortgagePrice>200000) {
	    	System.out.println("User will take a loan");
	    	
	    }else {
	    	System.out.println("User will pay cash");
	    }
		
	}
}
}
