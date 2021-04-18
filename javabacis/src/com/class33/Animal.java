package com.class33;

interface Dog {

public void eat();

}

interface Cat {

	public void bear();

	public void sound();
	
}

interface Animal extends Dog, Cat {
	
	public void eat();

	public void bear();

	public void sound();
}

class Living implements Animal {

	@Override
	public void eat() {
		System.out.println("An animal eats meat or weed.");
	}

	@Override
	public void sound() {
		System.out.println("An animal barks.");
	}

	@Override
	public void bear() {
		System.out.println("An animal can bear.");
	}

}
