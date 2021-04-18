package com.class28;

public class FruitTest {
	public static void main(String[] args) {

		Fruit fruit;

		fruit = new Apple("Red");

		fruit.eat();
		
		Apple apple = (Apple) fruit;
		apple.wash();

	}
}
