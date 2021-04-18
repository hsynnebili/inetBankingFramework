package Oops;

//Abstract class
public abstract class Animals {

	// Undefined(Abstract) Methods:

	public abstract void eat(); // Abstract method does not have a body.

	public abstract void animalSound();

	public abstract void bear();

	public abstract void sleep();

	// Defined(Non-Abstract) Methods:

	public void explan() {// Abstract class can contain defined(concrete-with implementation) method
		System.out.println("Abstract class can contain defined(concrete) method");

	}

	public void display() {
		System.out.println("Animals can eat,beer and sleep");
	}

	// Super Constructor
	Animals(String name) {
		System.out.println("Animals constructor called");

	}
}

//Subclass(inherit from Animals)

class Cat1 extends Animals {

	int age;
	String name;

	@Override
	public void eat() {
		System.out.println("Cat can drink milk");

	}

	@Override
	public void animalSound() {
		System.out.println("Cat can meow");

	}

	@Override
	public void bear() {

		System.out.println("Cat can beer");
	}

	@Override
	public void sleep() {
		System.out.println("Cat can sleep");

	}

	public Cat1(String name) {

		super(name);
		System.out.println("Cat constructor called");

	}

	public void display(String name, int age) {
		System.out.println(name + " is a cat and she is " + age + " years old and can eat,beer and sleep");
		this.name = name;
		this.age = age;
	}
}

class Dogg extends Animals {

	String name;
	int age;

	@Override
	public void eat() {
		System.out.println("Dog can eat meat");
	}

	@Override
	public void animalSound() {
		System.out.println("Dog can bark");
	}

	@Override
	public void bear() {
		System.out.println("Dog can beer");

	}

	@Override
	public void sleep() {
		System.out.println("Dog can sleep");

	}

	Dogg(String name, int age) {
		super(name);
		System.out.println("Dog constructor called");

	}

	public void diplay(String name, int age) {
		this.age = age;
		this.name = name;

		System.out.println(name + "is a dog and he is " + age + " old and can beer,eat and sleep.");
	}

}
