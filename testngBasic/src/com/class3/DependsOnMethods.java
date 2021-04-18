package com.class3;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void one() {
		System.out.println("one test ");
	}

//		@Test(dependsOnMethods="one")
//		public void two() {
//			System.out.println("two test ");
//		}
//		
	@Test(dependsOnMethods = { "one" })
	public void three() {
		System.out.println("three test ");
	}
}
