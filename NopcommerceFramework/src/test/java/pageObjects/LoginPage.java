package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//*[@value='Log in']")
	@CacheLookup
	WebElement clickButton;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String e_Email) {
		txtEmail.clear();
		txtEmail.sendKeys(e_Email);
	}

	public void setPassword(String pwd ) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		clickButton.click();
	}

	public void clickLogout() {

		lnkLogout.click();

	}

	public LoginPage(WebDriver driver) {


		//initialize all of our variables
		PageFactory.initElements(driver, this);
	}
}
