package Oops;

public interface Inf1 {

	public abstract void method1();

	public void method2();
}

interface Inf2 extends Inf1 {
	public void method2();

}

class Demo1 implements Inf2 {

	@Override
	public void method1() {
		System.out.println("method1");

	}

	@Override
	public void method2() {

		System.out.println("method2");
	}

}