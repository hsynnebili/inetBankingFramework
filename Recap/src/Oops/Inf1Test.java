package Oops;

public class Inf1Test {
	public static void main(String[] args) {

		Demo1 demo = new Demo1();

		demo.method1();
		demo.method2();

		System.out.println("===========");

		Inf1 inf1 = new Demo1();
		inf1.method1();

		System.out.println("============");

		Inf2 inf2 = new Demo1();
		inf2.method1();
		inf2.method2();

	}

}
