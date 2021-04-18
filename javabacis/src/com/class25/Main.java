package com.class25;

public class Main {
	static int count=1;
	  public void increment(){
	       count++;
	   }
	  public static void main(String[] args) {
	   Main obj= new Main();
	   Main obj1= new Main();
	  Main obj2= new Main();
	  
	   obj.increment();
	   obj1.increment();
	   obj2.increment();
	   
	   System.out.println(obj.count);
	   System.out.println(obj1.count);
	   System.out.println(obj2.count);

	    
	  }}

