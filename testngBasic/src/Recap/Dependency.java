package Recap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dependency {

	@BeforeClass

	public void before_class() {

		System.out.println("Hello!!!I'm before class.");

	}

	@BeforeMethod

	public void before_method() {
		System.out.println("I am before method.");
	}

	@Test(dependsOnMethods = { "test_3", "test_4" })

	public void test_1() {
		System.out.println("I am FIRST test method.");
	}

	@Test(enabled=false)

	public void test_2() {
		System.out.println("I am SECOND test method ");
	}

	@Test()
	public void test_3() {
		System.out.println("I am THIRD method.");
	}

	@Test()
	public void test_4() {
		System.out.println("I am FOURTH method.");
	}

	@AfterMethod
	public void after_method() {
		System.out.println("I am after method.");
	}

	@AfterClass

	public void after_class() {
		System.out.println("I am after class method.");
	}

}
