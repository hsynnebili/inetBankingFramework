package com.class14;

public class Reverse {
public static void main(String[] args) {
	String original ="Today is my birthday";
	String reverse="";
	
	
	    for(int i=original.length(); i>0; i--) {
	        
	        reverse=reverse+original.substring(i-1,i);
	   } System.out.println("Reversed String is: "+reverse);
	
}
}
