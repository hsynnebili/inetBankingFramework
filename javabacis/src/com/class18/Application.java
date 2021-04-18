package com.class18;

public class Application {

	public static void main(String[] args) {
		Human person1 = new Human();
		person1.print();
		 person1.eyeColor = "pink";
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.gender);
		System.out.println("-----------------------------");
		Human person2 = new Human();

		 person1.eyeColor = "orange";
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.gender);

	}

}
