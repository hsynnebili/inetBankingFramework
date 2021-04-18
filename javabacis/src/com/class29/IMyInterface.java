package com.class29;

public interface IMyInterface {
	void m1();

	void m2();

}

class Child3 implements IMyInterface {

	@Override
	public void m1() {

		System.out.println("implementation of method1");
	}

	@Override
	public void m2() {
		System.out.println("implementation of method2");

	}

}
