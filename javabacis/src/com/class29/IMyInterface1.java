package com.class29;

public interface IMyInterface1 {
	void m1();

	void m2(int a);

	void m3();
	
	void m4();
}

interface IMyInterface2 extends IMyInterface1 {
	
	void m4();
}

class Main1 implements IMyInterface2 {
	/*
	 * Even though this class is only implementing the interface MyInterface2, it
	 * has to implement all the methods of MyInterface2 as well because the
	 * interface MyInterface2 extends MyInterface1
	 */

	@Override
	public void m1() {
		System.out.println("welcome to syntax solutions");

	}

	@Override
	public void m2(int a) {
		System.out.println("hi syntax solutions how are you");

	}

	@Override
	public void m3() {
		System.out.println("Hello world");

	}

	@Override
	public void m4() {
		System.out.println("Hi everyone");

	}

}