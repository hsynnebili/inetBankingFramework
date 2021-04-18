package com.class26;

public class ClassA {
final void M1() {
	System.out.println("Final method is without paramether");
}
final void M1(int a,String b) {//final method can be overloaded.
	System.out.println("Overloaded the final method");
}
}
class B extends ClassA{
	
	final void M1() {//final method can't be overridden.
		System.out.println("Final method is without paramether");
}
}
