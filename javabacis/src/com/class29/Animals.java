package com.class29;

public abstract class Animals {
	
	public abstract void eat (); // Abstract method does not have a body.

	public abstract void sound ();

	public abstract void bear ();
	
    public void display () {
            	   
            	System.out.println("Animals can eat, bear and sleep");
	
            
    }
}
  
class Catttt extends Animals {
            		
	int age;
    String name ;

            		
    @Override         		
    public void eat () {
            		
    System.out.println("Cat can drink milk");
            	
    }

            		
    @Override
    public void sound () {
            		
    	System.out.println("Cat can meow");
            	
    }

            		
    @Override
    public void bear () {
            	             
    	System.out.println("Cat can bear"); 
            	
    } 
            	          
}


               
               



