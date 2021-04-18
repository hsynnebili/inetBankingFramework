package com.class12;

import java.util.Scanner;

public class Browser {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the browser name to proceed further with execution");
	String browser=scanner.nextLine();
	
	String browser1="chroME";
	String browser2="fireFOX";
	String browser3="Ie";
	
	if(browser.equals(browser1)) {
		System.out.println("Proceed with chrome Browser");
	}else if(browser.equals(browser2)) {
		System.out.println("Proceed with firefox Browser");
	}else if(browser.equals(browser3)) {
		System.out.println("Proceed with ie Browser");
	}else {
		System.out.println("Invalid Browser");
	}
}
}
