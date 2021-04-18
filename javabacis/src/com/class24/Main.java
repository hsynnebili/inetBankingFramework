package com.class24;

public class Main {

	static int batch = 3;
	 String InstituteName = "SyntaxSolutions";
	int year = 2019;

	static void display() {
		System.out.println(batch);
		
	}

	void display1() {
		System.out.println(year);
		System.out.println(InstituteName);
	}

	public static void main(String[] args) {
		Main.display();

		Main obj = new Main();
		System.out.println(obj.year);
		System.out.println(obj.InstituteName);

	}
}
