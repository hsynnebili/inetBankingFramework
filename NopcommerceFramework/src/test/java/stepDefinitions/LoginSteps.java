package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
 
import pageObjects.LoginPage;

public class LoginSteps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		lp = new LoginPage(driver);

	}

	@When("User opens URL{string}")
	public void user_opens_URL(String url) {

		driver.get(url);

	}

	@When("User enters Email as{string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {

		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() {

		lp.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {

		if (driver.getPageSource().contains("Login was unsuccesful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {

		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();

	}

}
