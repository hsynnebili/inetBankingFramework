package Oops;

public interface MyInterface {

	public void method1();

	public void method2();

}

interface MyInterface2 extends MyInterface {

	public void method3();

	public void method4();

}

class Demo4 implements MyInterface2 {

	@Override
	public void method1() {

	}

	@Override
	public void method2() {

	}

	@Override
	public void method3() {

	}

	@Override
	public void method4() {

	}

}

abstract class MyAbstract1 implements MyInterface2 {

	abstract int methodNumber();

	abstract String methodName();

	void display(String methodName) {

		System.out.println(methodName);

	}

}

class Demo extends MyAbstract1 {

	@Override
	public void method1() {
		System.out.println("implementation of method1");

	}

	@Override
	public void method2() {
		System.out.println("implementation of method2");

	}

	@Override
	public void method3() {
		System.out.println("implementation of method3");

	}

	@Override
	public void method4() {
		System.out.println("implementation of method4");

	}

	@Override
	int methodNumber() {

		return 0;
	}

	@Override
	String methodName() {

		return null;
	}

}
