package com.class29;

public interface InterfaceDeclare {
	int a = 100;
	final int b = 200;
	static int c = 300;
}

class Main3 implements InterfaceDeclare {
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
