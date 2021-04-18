package com.class29;

public abstract class AParent {
	abstract void method1();

	abstract void method2();
	

}

class Child extends AParent {

	@Override
	void method1() {
		System.out.println("abstract method1 implementation in main class");

	}

	@Override
	void method2() {
		System.out.println("abstract method2 implementation in main class");

	}

}
