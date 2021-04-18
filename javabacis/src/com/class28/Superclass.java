package com.class28;

class Superclass {

	String name;
	int age;
	static int salary = 70000;

	Superclass() { // no-arg constructor

		System.out.println("No-arg constructor of Super class ");
	}

	Superclass(String name, int age) { // arg or parameterized constructor

		System.out.println(name + " is " + age + " years old.");
	}

	public void display() {
		System.out.println("This is a normal method for superclass.");
	}
}

class Subclass extends Superclass {

	String country;
	int siblingNum;

	Subclass() {

		/*
		 * super() must be added to the first statement of constructor otherwise you
		 * will get a compilation error. Another important point to note is that when we
		 * explicitly use super in constructor the compiler doesn't invoke the parent
		 * constructor automatically.
		 */

	}

	Subclass(String name) {

		super("Ali", 12);

		System.out.println("My name is " + name + ".");

	}

	Subclass(String name, int age) {

		this("John");
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}

	Subclass(String name, int age, String country) {

		this("John", 25);

		System.out.println("My name is " + name + ",I am " + age + " years old and from " + country
				+ ".My annual salary is " + salary + " dollars.");
	}

	public void message() {

		System.out.println("This is a normal method for current class to be referred by this keyword.");
	}

	public void set(String country, int siblingNum) {

		super.display();

		this.message();

		super.name = "Ahmet";
		super.age = 12;

		this.country = country;
		this.siblingNum = siblingNum;

		System.out.println(name + " is " + age + " years old,he/she is from " + country + " and he/she has "
				+ siblingNum + " siblings.");
	}

}