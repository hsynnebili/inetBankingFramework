package com.class28;

public abstract class Animals {

	abstract void eat(); // Abstract method does not have a body(undefined method-without
							// implementation).

	public abstract void animalSound();

	public abstract void beer();

	public abstract void sleep();

	public void explain() { // Abstract class can contain defined(concrete-with implementation) method.
		System.out.println("Abstract class can defined method");
	}
	
	public void display() {
		System.out.println("Animals can eat,beer and sleep");
	}
}

abstract class Cat extends Animals { // abstract class extends another abstract class.

	int age;
	String name;

//	@Override
//	public void eat() {
//		System.out.println("Cat can drink milk");
//	}
//
//	@Override
//	public void animalSound() {
//		System.out.println("Cat can meow");
//	}
//
//	@Override
//	public void beer() {
//		System.out.println("Cat can beer");
//	}
}

class Dog extends Cat { // abstract class extends another class.

	int age;
	String name;

	@Override
	public void eat() {
		System.out.println("Dog can eat  meat");
	}

	@Override
	public void animalSound() {
		System.out.println("Dog can bark");
	}

	@Override
	public void beer() {
		System.out.println("Dog can beer");
	}

	@Override
	public void sleep() {
		System.out.println("Dog can sleep");
	}
}

class AnimalsTest {

	public static void main(String[] args) {

		Animals animal = new Dog(); // Abstract class can not be instantiated.
		animal.animalSound();
		animal.beer();
		animal.display();

		Dog dog = new Dog();
		dog.animalSound();

	}

}
