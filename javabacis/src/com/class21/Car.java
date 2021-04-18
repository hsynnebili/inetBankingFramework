package com.class21;

public class Car {
	 public static String make = "Toyota";
	    String colour;
	    String model;
	    int doors;

	    Car() { // constructor // same as the class name

	        System.out.println("I am a constructor");
	        System.out.println("Hello from constructor");
	    }

	    public static void main(String[] arg) {
//		    public --> ACCESS MODIFIER
//		    static --> NON ACCESS MODIFIER
//		    void --> RETURN TYPE
//		    main --> name of the method
//		    String [] args --> parameters - array of Strings with name args


	        Car obj = new Car();
	        hello();
	        // Car --> CLASS NAME
	        // obj --> REFERENCE VARIABLE/OBJECT NAME
	        // = --> ASSIGNING OPERATOR
	        // new --> THE KEYWORD THAT CREATES A NEW OBJECT
	        // Car() --> CONSTRUCTOR

	    }

	    public static void hello() {
	        System.out.println("I am a static hello method");
	    }
}