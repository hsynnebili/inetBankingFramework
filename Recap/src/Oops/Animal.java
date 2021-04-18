package Oops;

public interface Animal {

	public  void eat();

	public void sound();

	public void bear();

}
// abstract class Animal2{
//	 
//	public  abstract void bark() ;//abstract method -unimplemented
//	
//	public void eat() {//non-abstract method-implemented
//		
//	}
// }

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("A dog eats meat");

	}

	@Override
	public void sound() {
		System.out.println("A dog barks");
	}

	@Override
	public void bear() {
		System.out.println("A dog can bear");

	}

}

class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("A cat drinks milk");

	}

	@Override
	public void sound() {
		System.out.println("A cat meows");

	}

	@Override
	public void bear() {
		System.out.println("A cat can bear");
	}

}
