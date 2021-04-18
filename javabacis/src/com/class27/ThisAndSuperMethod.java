package com.class27;

class ThisAndSuperMethod {
	int a = 10, b = 20;
}

class Child extends ThisAndSuperMethod {
	int a=30;
	int b=20;

	void m1(int a, int b) // local variables
	{
		
		System.out.println(a + b); // local variables addition
		System.out.println(this.a + this.b); // current class variables addition
		System.out.println(super.a + super.b); // super class variables addition
	}
}
