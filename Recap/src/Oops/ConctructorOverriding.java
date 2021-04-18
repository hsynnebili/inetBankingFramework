package Oops;

public class ConctructorOverriding extends Constructor {

	public void Constructor() {// This is a method not a constructor because class and constructor names are
								// not same.

		System.out.println("I am not a constructor because my name not same with the class' name.I m just a method.");

	}

	ConctructorOverriding() {
		System.out.println("I am a constructor called subclass constructor and don't have any parameters.");
	}

}
