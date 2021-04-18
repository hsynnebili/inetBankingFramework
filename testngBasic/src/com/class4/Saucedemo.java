package com.class4;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Saucedemo extends CommonMethods {

//	@BeforeMethod(alwaysRun = true, groups = "Smoke")
//
//	public void setUp() {
//		String url = "https://www.saucedemo.com/";
//		CommonMethods.setUpDriver("chrome", url);
//	}

	@Test(groups = "Smoke")
	public void UserName1() throws InterruptedException {

		setUpDriver("chrome", "https://www.facebook.com/");

		sendText(driver.findElement(By.cssSelector("input#email")), "fatihsaki@yandex.com");
		sendText(driver.findElement(By.cssSelector("input#pass")), "2112522hn");
		driver.findElement(By.cssSelector("label#loginbutton")).click();

		boolean present = driver.findElement(By.xpath("//*[@id=\"navItem_217974574879787\"]/a/div")).isDisplayed();
		System.out.println("User loged in" + present);
		Thread.sleep(3000);

		driver.quit();
	}

	@Test(groups = "Smoke")
	public void UserName2() throws InterruptedException {

		setUpDriver("chrome", "https://www.saucedemo.com/");
		Thread.sleep(3000);

		sendText(driver.findElement(By.id("user-name")), "problem_user");
		sendText(driver.findElement(By.id("password")), "secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		boolean present = driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed();
		System.out.println("User loged in" + present);
		Thread.sleep(3000);

		driver.quit();
	}

//	@AfterMethod(alwaysRun = true, groups = "Smoke")
//	public void tearDown() {
//		driver.close();
//	}
}
