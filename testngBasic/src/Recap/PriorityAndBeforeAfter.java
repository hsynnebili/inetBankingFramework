package Recap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityAndBeforeAfter {

	@BeforeSuite
	public void sayHello() {
		System.out.println("Hello!!!.I'm Before Suite.");

	}

	@BeforeTest
	public void sayHello1() {
		System.out.println("Hello!!!.I'm Before Test.");

	}

	@BeforeClass
	public void sayHello2() {
		System.out.println("Hell!!!.I'm Before Class.");

	}

	@BeforeMethod
	public void sayHello3() {
		System.out.println("Hello!!!.I'm Before Method.");

	}

	@Test(priority = 1)
	public void test_1() {

		System.out.println("Hello!!!.I'm Test_1 method and  codding.");

	}

	@Test(priority = 0)
	public void test_2() {

		System.out.println("Hello!!!.I 'm Test_2 method and have been still codding.");

	}

	@Test(priority = 2)
	public void test_3() {

		System.out.println("Hello!!!.I 'm Test_3 method and have been still codding for 2 hours.");

	}

	@AfterMethod

	public void sayBye() {
		System.out.println("I'm After Method.Bye!!!");
	}

	@AfterClass

	public void sayBye1() {
		System.out.println("I'm After Class.Bye!!!");
	}

	@AfterTest

	public void sayBye2() {
		System.out.println("I'm After Test.Bye!!!");
	}

	@AfterSuite

	public void sayBye3() {
		System.out.println("I'm After Suite.Bye!!!");
	}
}
