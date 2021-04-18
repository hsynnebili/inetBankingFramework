package com.class26;

public class MainMethodOverLoadingAndCalling {

	public static void main(String[] args) { 
       
        MainMethodOverLoadingAndCalling.main("Hello"); 
        MainMethodOverLoadingAndCalling.main("Hello","How are you"); 
        MainMethodOverLoadingAndCalling.main("Hello","How are you",10);
    } 

    // Overloaded main methods 
    public static void main(String arg1) { 
        System.out.println("main(String arg1"); 
       
    } 
    public static void main(String arg1, String arg2) { 
        System.out.println("main(String arg1, String arg2");
} 
    public static void main(String arg1, String arg2,int a) { 
        System.out.println(10+" main(String arg1, String arg2");
}}