package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Facebook_With_Parameters extends CommonMethods {

	@Parameters({ "browser", "url" })

	@BeforeClass

	public void setUp(String chrome, String link) throws InterruptedException {

		setUpDriver(chrome, link);

	}

	@Parameters({ "email", "pass" })

	@Test
	public void login(String email, String pass) throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(2000);

		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);

	}

	@AfterClass

	public void logout() throws InterruptedException {

		driver.quit();
	}
}
