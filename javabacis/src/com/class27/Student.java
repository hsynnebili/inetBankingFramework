package com.class27;

public class Student {

	int number;
	String name, course;

	Student(String name) {

		this.name = name;

	}

	Student(String name, int number) {

		this(name); // reusing constructor
		this.number = number;
	}

	void display() {
		System.out.println(name + " is a student which has " + number + " number in our class.");
	}
}
