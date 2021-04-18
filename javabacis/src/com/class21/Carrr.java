package com.class21;

public class Carrr {

	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;

	Carrr(String make, String model, int numberOfDoors, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;

	}

	Carrr(String make, String model, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
	}

	Carrr(int numberOfDoors, int topSpeed, double price) {

		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;

	}

	Carrr(String make, String model, int numberOfDoors) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
	}

	public static void main(String[] args) {

		Carrr obj = new Carrr("Toyota", "Prius", 4, 120, 30000.0);
		Carrr obj1 = new Carrr("Toyota", "Prius", 4, 120, 30000.0);
		Carrr obj2 = new Carrr("unknown", "unknown", 4, 120, 30000.0);
		Carrr obj3 = new Carrr("Toyota", "Prius", 4, 90, 0.0);

		System.out.println(obj.make + " " + obj.model + " " + obj.numberOfDoors + " " + obj.topSpeed + " " + obj.price);

		System.out.println(obj1.make + " " + obj1.model + " " + "4" + " " + obj1.topSpeed + " " + obj1.price);

		System.out.println(obj2.make + " " + obj2.model + " " + 4 + " " + obj2.topSpeed + " " + obj2.price);

		System.out.println(
				obj3.make + " " + obj3.model + " " + obj3.numberOfDoors + " " + obj3.topSpeed + " " + obj3.price);

	}
}
