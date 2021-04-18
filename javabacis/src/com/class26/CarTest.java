package com.class26;

public class CarTest {
	public static void main(String[] args) {

		Car car = new Car();
		car.drive();
		car.drive(70);
		
		BMW bmw= new BMW();
		bmw.drive();
		
		Toyota toyota=new Toyota();
		toyota.drive();

		Car car1 = new BMW();//Polymorphism
		car1.drive();

		Car car2 = new Toyota();//Polymorphism
		car2.drive();

	}
}
