package com.class26;

public class FinalMethodCalling {

	public static void main(String[] args) {
		FinalMethodCalling obj = new FinalMethodCalling();
		obj.call();

		FinalMethodCalling obj1 = new FinalMethodCalling();
		obj1.call("Hello");

	}

	final boolean call() {
		System.out.println("Final method with boolean parameter");
		return true;
	}

	final String call(String name) {

		System.out.println("Final method with String parameter");
		return name;
	}

}
