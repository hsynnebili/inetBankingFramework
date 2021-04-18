package com.class26;

public class Employeee {

	String name, lastName;

	Employeee() {
		System.out.println("I am a parnet constructor");
	}

	Employeee(String name, String lastName) {

		this.name = name;
		this.lastName = lastName;
	}
}

class Testerr extends Employeee {
	int salary;

	Testerr(String name, String lastName, int salary) {
		super(name, lastName);
		this.name = name;
		this.lastName = lastName;
		this.salary=salary;

	}
	
	public void displayDetails() {
		System.out.println("Employee " + name + " " +
	lastName + " has a salary of " + salary);
	}
}
