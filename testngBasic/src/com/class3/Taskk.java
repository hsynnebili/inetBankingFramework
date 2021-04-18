package com.class3;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Taskk extends CommonMethods{

	@BeforeClass(groups="Regression")
	
	public void setIP() {
		String url="http://newtours.demoaut.com/";
		setUpDriver("chrome",url);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
	}
	@Test(groups="Smoke")
	public void contacInfo() {
		sendText(driver.findElement(By.cssSelector("*[name='firstName']")),"huseyin");
		sendText(driver.findElement(By.cssSelector("*[name='firstName']")),"nebili");
		sendText(driver.findElement(By.cssSelector("*[name='phone']")),"20123123124");
		sendText(driver.findElement(By.cssSelector("*[id='userName']")),"huseyinnebili@hotmail.com");
		
		
	}
	@Test(groups="Regression")
	public void userInformation() {
		 sendText(driver.findElement(By.cssSelector("input#email")), "huseyin");
	        sendText(driver.findElement(By.cssSelector("input[name='password']")), "nebili");
	        sendText(driver.findElement(By.cssSelector("input[name='confirmPassword']")), "nebili");
	    driver.findElement(By.cssSelector("input[name='register']")).click();
	}
	@AfterTest(groups="Regression")
	public void teardown() {
	driver.quit();
	}
}
