package com.class3;

import org.testng.annotations.Test;

public class BasicXMLPartOne {

	@Test
	public void testOneFromBasic1() {
		System.out.println("testOne");
	}

	@Test
	public void testSecondFromBasic1() {
		System.out.println("testTwo");
	}

	@Test
	public void testThirdFromBasic1() {
		System.out.println("testThree");
	}

	public class BasicXMLPartTwo {
		@Test
		public void testOneFromBasic2() {
			System.out.println("testOne");
		}

		@Test
		public void testSecondFromBasic2() {
			System.out.println("testTwo");
		}

		@Test
		public void testThirdFromBasic2() {
			System.out.println("testThree");
		}

	}
}