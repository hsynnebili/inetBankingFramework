package Recap;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Saucedemo extends CommonMethods {

	@BeforeClass(groups = { "smoke", "Regression" })

	public void setUp() {

		setUpDriver("chrome", "https://www.saucedemo.com/");
	}

	@Test(priority = 1, groups = { "smoke", "Regression" })

	public void login() throws InterruptedException {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 2, groups = { "smoke", "Regression" })

	public void display() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='product_label']")));

		String expected_text = "Products";
		String actual_text = driver.findElement(By.xpath("//*[@class='product_label']")).getText();
		System.out.println(actual_text);

		if (actual_text.equalsIgnoreCase(expected_text)) {
			System.out.println(actual_text);

		} else {
			System.out.println("No any text");
		}
	}

	@Test(priority = 3, groups = { "smoke", "Regression" })

	public void add() throws InterruptedException {

		List<WebElement> act_Text = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));

		for (WebElement act_Texts : act_Text) {

			String list_Text = act_Texts.getText();
			System.out.println("List :" + list_Text);

			if (list_Text.contains("Sauce Labs Backpack")) {
				driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
				Thread.sleep(2000);
			}

		}
	}

	@Test(priority = 4, groups = { "smoke", "Regression" })
	public void getElement() {
		try {

			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span ")).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("There is an exception");

		}
	}

	@Test(priority = 5, groups = { "smoke", "Regression" })
	public void photo() {
		TakesScreenshot photo = (TakesScreenshot) driver;
		File selfie = photo.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(selfie, new File("screenshots/taskOne/Saucedemo.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Selfie not taken");
		}

	}

	@AfterClass(groups = { "smoke", "Regression" })

	public void logout() throws InterruptedException {

		driver.findElement(By.xpath("//*[@class='bm-burger-button']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
