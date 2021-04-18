package Oops;

public abstract class Shape {

	String color;

	// these are the abstract methods

	abstract double area();

	public abstract String toString();

	
	// abstract class can have constructor

	public Shape(String color) {
		System.out.println("Shape constructor called");

		this.color = color;

	}

	// this is a concrete method
	public String getColor() {
		return color;

	}

}

class Circle extends Shape {

	double radius;

	public Circle(String color, double radius) {

		// calling Shape(Super) constructor

		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;

	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);

	}

	@Override
	public String toString() {

		return "Circle color is " + super.color + "and area is : " + area();
	}

}

class Rectangle extends Shape {

	double lenght;
	double width;

	public Rectangle(String color, double lenght, double width) {

		// calling Shape(super) constructor

		super(color);
		System.out.println("Rectangle constructor called");

		this.lenght = lenght;
		this.width = width;

	}

	@Override
	double area() {
		
		return lenght * width;
	}

	@Override
	public String toString() {
		
		return "Rectangle color is " + super.color +  
                "and area is : " + area(); 
	}

}