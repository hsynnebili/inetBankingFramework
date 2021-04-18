package com.class24;

public class Calling {

	static String ss = "Welcome To Syntax Solutions";
	static Calling obj;

	public static void main(String[] args) {
		System.out.println(ss);//By calling directly.

		System.out.println(Calling.ss);//By using the className.
		
		Calling.obj = new Calling();//By creating the object of the class.

		System.out.println(obj.ss);

	}
}
