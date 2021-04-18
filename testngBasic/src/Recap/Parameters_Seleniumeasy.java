package Recap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Parameters_Seleniumeasy extends CommonMethods {

	@Parameters({ "browser", "url" })

	@BeforeClass

	public void setUp(String browser, String url) throws InterruptedException {
		setUpDriver(browser, url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");// scroll up
		Thread.sleep(2000);
	}

	@Parameters({ "send_message" })

	@Test

	public void Single_Input_Field(String send_message) throws InterruptedException {

		driver.findElement(By.id("user-message")).sendKeys(send_message);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='get-input']//button")).click();
		Thread.sleep(2000);

		WebElement text = driver.findElement(By.id("display"));
		System.out.println("My message :" + text.getText());
		Thread.sleep(2000);

	}

	@Parameters({ "value_1", "value_2" })

	@Test

	public void Two_Input_Field(String value_1, String value_2) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");// scroll up
		Thread.sleep(2000);

		driver.findElement(By.id("sum1")).sendKeys(value_1);
		Thread.sleep(2000);

		driver.findElement(By.id("sum2")).sendKeys(value_2);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();
		Thread.sleep(2000);

		System.out.println("My sub total :" + driver.findElement(By.id("displayvalue")).getText());
		Thread.sleep(2000);

	}

	@AfterClass

	public void close() {

		driver.quit();

	}

}
