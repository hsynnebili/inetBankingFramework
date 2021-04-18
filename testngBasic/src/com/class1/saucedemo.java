package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;


public class saucedemo extends CommonMethods {

//	TC 1: Swag Lab Title and Login Verification
//
//	@BeforeMethod should contain navigation to the URL and title verification
//	https://www.saucedemo.com/
//
//	@Test should contain steps to login and �Product� word verification
//
//	@AfterMethod should logOut from the application and close the browser

	@BeforeMethod

	public void setUP() {
		setUpDriver("chrome", "https://www.saucedemo.com/");
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.cssSelector("*[id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("*[id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("*[type='submit']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.cssSelector("*[class='product_label']")).getText();

		if (text.equals("Products")) {
			System.out.println(" Products is ON");
		} else {
			System.out.println("Products is OFF");
		}

	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.cssSelector("*[style='position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none; opacity: 0; font-size: 8px; cursor: pointer;']"))
				.click();

//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[id='logout_sidebar_link']")));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#logout_sidebar_link")));
		driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		driver.close();
	}
//		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
//		driver.quit();

}
