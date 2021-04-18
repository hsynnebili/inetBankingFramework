package com.class21;

public class Tarzan {
	String name;
	String breed;
	double a;
	public Tarzan(String name,String breed,double a){
		this.name=name;
		this.breed=breed;
		this.a=a;
		
	    
	}
	 public Tarzan(String name,double b){
		 this.name=name;
		 this.a=a;
	}

	    public static void main(String[] args) {
	        
	    	Tarzan obj=new Tarzan("Tarzan","Mudd",50.0);
	    	Tarzan obj1=new Tarzan("Tarzan",50.0);
	    	System.out.println(obj.name+" "+obj.breed+" "+obj.a);
	    	System.out.println(obj.name+" "+" "+obj.a);
}

}
