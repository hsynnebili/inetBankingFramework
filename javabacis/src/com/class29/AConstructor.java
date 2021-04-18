package com.class29;

abstract class AConstructor {

	AConstructor() {
		System.out.println("abstract class Constructor");

	}
}

class Main extends AConstructor {
	Main() {
		System.out.println("main class Constructor");
	}

}
