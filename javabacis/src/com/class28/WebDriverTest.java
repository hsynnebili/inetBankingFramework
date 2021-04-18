package com.class28;
//
public class WebDriverTest {
//	 public static void main(String[] args) {
//		 
//		 WebDriver test=new ChromeDriver();
//		 test.openBrowser();
//		 test.closeBrowser();
//		 test.findElement();
//		 test.maximizeWindow();
//		 System.out.println("-------------------------------------------------------");
//		 
//		 WebDriver test1=new FirefoxDriver();
//		 test1.openBrowser();
//		 test1.closeBrowser();
//		 test1.findElement();
//		 test1.maximizeWindow();
//		     }
//}
public static void main(String[] args) {
        
        
        WebDriver test=new ChromeDriver();
        test.openBrowser();
        test.closeBrowser();
        test.findElement();
        test.maximizeWindow();
        
        
        
        test=new FirefoxDriver();
        test.openBrowser();
        test.closeBrowser();
        test.findElement();
        test.maximizeWindow();
    }}
