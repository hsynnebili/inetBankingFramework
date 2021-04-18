package com.class4;

public class NestedIfAgain {
public static void main(String[] args) {
	
	/*
	 * declare variable for gpa and having a diploma
	 * if user has a diploma ==>congratulations-->if gpa is higher 3.5-->
	 */
	double gpa=3.6;
	double expectedGpa=3.6;
	boolean hasDiploma=true;
	
	if(hasDiploma) {
		System.out.println("Congratulations, you have diploma.");
	    if(gpa>=expectedGpa) {
		System.out.println("Congratulations, You are hired");
	    }else {
		System.out.println("Unfortunately we can not hire you");
	    }
	}else {
		System.out.println("Please get your degree");
	  
     }	
		
	}
}

