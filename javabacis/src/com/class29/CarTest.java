package com.class29;

public class CarTest {
	public static void main(String[] args) {

		Car car = new Sedan("blue", 25000, 3000);
		double carPrice = car.calculateSalePrice();
		System.out.println("Car price is " + carPrice);

		Car car1 = new Truck("blue", 25000, 3000);
		double carPrice1 = car1.calculateSalePrice();
		System.out.println("Truck price is " + carPrice1);
	}
}
