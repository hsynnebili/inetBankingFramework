 package com.class21;

public class StaticVsNonStatic {
	public String name = "John";// instance variable
	public static String lastName = "Snow";// static variable

	public static void main(String[] args) {

		//we called it in the same class.
		StaticVsNonStatic obj = new StaticVsNonStatic();//we created an obj.within StaticVsNonStatic(class).
		obj.getInfo();//non-static method was called.(As first one was printed.)
		getInfo1(); //static method was called. Within same class we can call it by using method/variable name.(As second one was printed.)

		System.out.println(lastName);//(As third was printed.)

	}
	
	// non static method-->we can access both instance(name) and static variables(lastName).

	public  void getInfo() {
		System.out.println("My name is " + name + " and my last name is " + lastName);

	}
	
	// static method-->we can just access static variables(lastName)

	public static void getInfo1() {
		//System.out.println("My name is "+name+"and my last name is "+lastName);
		// WILL GET AN ERROR
		
		System.out.println("I am a static method.");
		// getInfo();--> we cannot access non static method within static method.
	}
}
