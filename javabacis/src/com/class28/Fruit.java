package com.class28;

public abstract class Fruit {
	String color;

	public abstract void eat();

}

class Apple extends Fruit {

	Apple(String color) {
		this.color = color;
	}

	@Override
	public void eat() {
		System.out.println("We should wash before eating");
	}
	
	public void wash() {
		System.out.println("Washing the apple");
	}
}

class Banana extends Fruit {
	
	Banana(String color){
		this.color = color;
	}

	@Override
	public void eat() {
		System.out.println("We should peel the banana");
	}
}