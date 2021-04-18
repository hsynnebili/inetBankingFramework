package com.class28;

public interface WebDriver {
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Chrome open browser");
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Chrome close browser");

	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("chrome maximize Window");

	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("chrome can find element");

	}

}

class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Firefox open browser");

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Firefox close browser");

	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		System.out.println("Firefox maximize Window");

	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		System.out.println("Firefox can find element");

	}
}
