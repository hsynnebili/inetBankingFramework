package com.class27;

public class ThisAndSuperMethodCalling {
	void display() {
		System.out.println("m1 method in parent class");
	}
}

class Child1 extends ThisAndSuperMethodCalling {
	void display() {
		System.out.println("m1 method in child class");
	}

	void m2() {

		this.display();
		super.display();
	}
}
