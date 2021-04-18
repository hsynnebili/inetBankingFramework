package Oops;

abstract class Vehicle {

	abstract void startEngine();

	abstract void stopEngine();

}

interface Movable {
	void move();
}

class Car extends Vehicle implements Movable {

	int age;
	String name;
	String model;

	@Override
	public void move() {
		System.out.println("moving car");

	}

	@Override
	void startEngine() {
		System.out.println("starting car's engine");
	}

	@Override
	void stopEngine() {
		System.out.println("stoping car's engine");

	}

	public void display(int age, String model, String name) {
		this.age = age;
		this.model = model;
		this.name = name;

		System.out.println(name + " is a car and it is " + age + " years old and it's model is " + model);

	}

}