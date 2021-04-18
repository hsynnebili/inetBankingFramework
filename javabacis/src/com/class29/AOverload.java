package com.class29;

abstract public class AOverload {
	abstract void m1(int a);

	abstract void m1();

}

class Child2 extends AOverload {

	@Override
	void m1(int a) {
		System.out.println("abstract method2 implementation with argument in main class");

	}

	@Override
	void m1() {
		System.out.println("abstract method1 implementation without argument in main class");

	}

}
