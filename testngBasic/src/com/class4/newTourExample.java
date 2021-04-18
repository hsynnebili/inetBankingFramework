package com.class4;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class newTourExample extends CommonMethods {

	@Parameters({ "browser", "url" })
	@BeforeMethod(alwaysRun = true)
	public void setUp(String chrome, String link) {
		setUpDriver(chrome, link);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	}

	@Parameters({ "user", "pass", "cpass" })
	@Test()
	public void userInformation(String user, String pass, String cpass) throws InterruptedException {
		sendText(driver.findElement(By.cssSelector("input#email")), user);
		sendText(driver.findElement(By.cssSelector("input[name='password']")), pass);
		sendText(driver.findElement(By.cssSelector("input[name='confirmPassword']")), cpass);
		driver.findElement(By.cssSelector("input[name='register']")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
