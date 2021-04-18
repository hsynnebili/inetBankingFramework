package com.class24;

public class Increment {
	
		  static int count=0;
		  public static void increment(){
		       count++;
		   }
		  public static void main(String[] args) {
			  Increment.increment();
			  Increment obj= new Increment();//Static variable'i object olusturarak  cagirdik.
			  Increment obj1= new Increment();
			  Increment obj2= new Increment();
		  
		   obj.increment();
		   obj1.increment();
		   obj2.increment();
		   
		   System.out.println(obj.count);
		   System.out.println(obj1.count);
		   System.out.println(obj2.count);

		    
		  }}

