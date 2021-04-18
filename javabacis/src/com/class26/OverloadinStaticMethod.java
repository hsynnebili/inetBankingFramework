package com.class26;

public class OverloadinStaticMethod {
	
		
		 

		
	public static void display() { 
        System.out.println("M1 method without parameter "); 
    } 
    public static void display(int a) {  
        System.out.println("M2 method with int parameter "); 
    } 
    public static void main(String args[]) 
    {  
       OverloadinStaticMethod.display(); 
       OverloadinStaticMethod.display(1); 
    } 
} 