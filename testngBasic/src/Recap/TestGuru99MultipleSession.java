package Recap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class TestGuru99MultipleSession extends CommonMethods {

	@Test

	public void executSessionOne() throws InterruptedException {

		setUpDriver("firefox", "http://demo.guru99.com/V4/");
		Thread.sleep(3000);

		driver.findElement(By.name("uid")).sendKeys("Driver 1");
		Thread.sleep(2000);

		driver.quit();

	}

	@Test

	public void executeSessionTwo() throws InterruptedException {

		setUpDriver("chrome", "http://demo.guru99.com/V4/");
		Thread.sleep(3000);

		driver.findElement(By.name("uid")).sendKeys("Driver 2");
		Thread.sleep(2000);

		driver.quit();

	}

	@Test

	public void executSessionThree() throws InterruptedException {

		setUpDriver("ie", "http://demo.guru99.com/V4/");
		Thread.sleep(3000);

		driver.findElement(By.name("uid")).sendKeys("Driver 3");
		Thread.sleep(2000);

		driver.quit();

	}

}
