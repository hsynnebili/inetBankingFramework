package com.class17_3;

public class NoMainMethod {
//methods and variables are member of the class
	String str;
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
		System.out.println("Good morning");
	}
	void bye() {
		System.out.println("Bye");
	}
	void howAreYou() {
		System.out.println("How are you?");
	}
	public static void main(String[] args) {//method signature
		NoMainMethod obj=new NoMainMethod();//method body
		obj.hello();
		obj.bye();
		obj.howAreYou();
		
		}
	
		
		
	}
	
	

