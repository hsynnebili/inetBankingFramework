package com.class26;

public class ConstructorMethodOverLoading {

	ConstructorMethodOverLoading() {
		System.out.println("Welcome to the syntax solutions");
	}

	ConstructorMethodOverLoading(String name) {
		System.out.println("I am the student in syntax solutions");
	}

	public static void main(String[] args) {
		ConstructorMethodOverLoading obj = new ConstructorMethodOverLoading();
		ConstructorMethodOverLoading ob1 = new ConstructorMethodOverLoading("Syntax");

	}
}
