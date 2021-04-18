package com.class28;

public class Application {
	public static void main(String[] args) {
		Human h2 = new Human("Ali", 45);
		h2.speak();

		System.out.println("=========");

//		
//		Tester t2 = new Tester("Veli", 50, 150000);
//		t2.speak();
//		t2.code();

		Human h1 = new Tester("Veli", 50, 150000);
		h1.speak();
//		h1.code();

		System.out.println("-------");

		Tester t1 = (Tester) h1;
		t1.speak();
		t1.code();
	}
}
