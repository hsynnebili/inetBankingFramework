package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Facebook extends CommonMethods {

	@BeforeMethod

	public void setUp() {
		setUpDriver("chrome", "https://www.facebook.com/");
	}

	@Test(invocationCount = 2)

	public void login() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("fatihsaki@yandex.com");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("2112522hn");
		Thread.sleep(2000);

		driver.findElement(By.id("loginbutton")).click();

	}

	@AfterMethod

	public void logout() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"userNavigationLabel\"]")));
		driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']/a")).click();
		driver.quit();

	}

}
