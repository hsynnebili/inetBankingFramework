package com.inetBankingFramework.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingFramework.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {

		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Entered user name");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();

		System.out.println("Title is :" + driver.getTitle());
		Thread.sleep(2000);

		if (driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info("Login test passed");

		} else {

			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
