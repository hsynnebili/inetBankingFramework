package com.class24;

public class TestParent {
	public static void main(String[] args) {
		String a = "10";

		double d = 12;

		Parent parent = new Parent();
		parent.love();
		parent.work();
		
		System.out.println("----------------");
		
		Child child = new Child();
		child.love();
		child.cry();
		child.work();

		// Child obj1=new Parent();not possible
		// type casting
		// achieving run time polymorphism
		
		System.out.println("----------------");

		Parent obj = new Child();
		obj.work();// Parents work
		obj.love();// Child love--common method
		obj.eat();
		// obj.cry();not accessible
	}
}
