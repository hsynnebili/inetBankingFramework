package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.CommonMethods;

public class LoginStepDefinition extends CommonMethods {

	public static WebDriver driver;

	@Given("^User is already Login Page$")
	public void user_is_already_Login_Page() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/husey/eclipse-workspace/FreeCrmFramework/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");

	}

	@When("^Title of login pages is Free CRM$")
	public void title_of_login_pages_is_Free_CRM() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software can boost your sales by 30%", title);

	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {

		WebElement buton = driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[1]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", buton);

		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("huseyinnebili@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("2112522Hn");

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {

	}

}
