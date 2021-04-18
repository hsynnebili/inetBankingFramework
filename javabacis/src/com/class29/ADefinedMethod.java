
package com.class29;

public abstract class ADefinedMethod {

	abstract void method1();

	abstract void method2();

}

class Child1 extends ADefinedMethod {

	@Override
	void method1() {
		System.out.println("abstract method1 implementation in child class");

	}

	@Override
	void method2() {
		System.out.println("abstract method2 implementation in child class");

	}
}