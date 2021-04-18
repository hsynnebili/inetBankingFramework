package com.class2;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class taskk extends CommonMethods {

	@BeforeClass

	public void setUp() {

		setUpDriver("chrome", "https://www.saucedemo.com/");
		boolean swagLabs = driver.findElement(By.cssSelector("*[class='login_logo']")).isDisplayed();
		if (swagLabs = true) {
			System.out.println("this is the right title");
		} else {
			System.out.println("this is the wrong title");
		}
	}

	@Test(priority=0)
	public void login() {
		sendText(driver.findElement(By.cssSelector("*[id='user-name']")), "standard_user");
		sendText(driver.findElement(By.cssSelector("*[id='password']")), "secret_sauce");
		driver.findElement(By.cssSelector("*[class='btn_action']")).click();

	}
	@Test(priority=1)
	public void mainPage() throws InterruptedException {
		String actual=driver.findElement(By.cssSelector("*[class='product_label']")).getText();
		String expected="Products";
		
		if(actual.equals(expected)) {
			System.out.println("expected matches actual text");
		}else {
			System.out.println("expected does not matche actual text");
		}
		Thread.sleep(2000);
		
	}
	@Test(priority=2)
	public void fleeceJacket() throws InterruptedException {
		
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='item_5_img_link']")));
	driver.findElement(By.xpath("//*[@id='item_5_img_link']")).click();
	Thread.sleep(5000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[class='inventory_details_desc']")));

	}
	
	
	@AfterClass
	
	public void closePage() {
		driver.close();
	}
}