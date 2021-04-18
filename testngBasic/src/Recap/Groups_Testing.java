package Recap;

import org.testng.annotations.Test;

public class Groups_Testing {

	@Test(groups = "Regression")

	public void test_1() {

		System.out.println("I am FIRST and Regression test...");
	}

	@Test(groups = "Smoke")

	public void test_2() {

		System.out.println("I am SECOND and Smoke test...");
	}

	@Test(groups = "Regression")

	public void test_3() {

		System.out.println("I am THIRD and Regression test...");
	}

	@Test(groups = "Smoke")

	public void test_4() {

		System.out.println("I am FOURTH and Smoke test...");
	}
}
