package com.class21;

public class CallingStaticVsNonStaticClass {
	 public static void main(String[] args) {
		    
		 //calling a non-static variable:
	        StaticVsNonStatic obj = new StaticVsNonStatic();
	        System.out.println(obj.name);//accessing non static members
	       
	       //calling a static variable: 
	        System.out.println(StaticVsNonStatic.lastName);//accessing static members by using className they belong to
	       
	        //calling a static method:
	        StaticVsNonStatic.getInfo1();
	        
	        

	    }

}
