package Oops;

public class AnimalTest {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		dog.bear();

		System.out.println("==============");

		Cat cat = new Cat();
		cat.eat();
		cat.sound();
		cat.bear();

		System.out.println("==============");

		Animal animal = new Dog();
		animal.bear();
		animal.eat();
		animal.sound();

		System.out.println("==============");

		Animal animal1 = new Cat();
		animal1.bear();
		animal1.eat();
		animal1.sound();
	}
}
