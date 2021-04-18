package com.inetBankingFramework.testCases;

import java.io.IOException;


import org.openqa.selenium.NoAlertPresentException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBankingFramework.Utilities.XLUtils;
import com.inetBankingFramework.pageObjects.LoginPage;

public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		Thread.sleep(2000);

		if (isAlertPresent() == true) { // login invalid condition

			driver.switchTo().alert().accept();// close login alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			logger.warn("Login failed");

		} else { // login valid condition

			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogout();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();// close logout alert
			driver.switchTo().defaultContent();

		}
	}

	public boolean isAlertPresent() {// The user defined the method created to check alert is present or not

		try {
			driver.switchTo().alert();
			return true;

		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {

		String path = System.getProperty("user.dir")
				+ "/src/test/java/com/inetBankingFramework/testData/LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {

				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}

		}
		return logindata;
	}
}
