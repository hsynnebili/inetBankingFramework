package com.class16;

public class Phone {

	String brand,application,model;
	boolean LTE;
	int screen;
	
	public static void main(String[] args) {
		
		System.out.println("--------------Phone 1----------");
		Phone phn1 =new Phone();
		
		phn1.brand="iPhone";
		phn1.model="Golden";
		phn1.application="AppStore";
		phn1.LTE=true;
		phn1.screen=5;
		
		phn1.call();
		phn1.text();
		phn1.intSurfing();
		
		System.out.println("--------------Phone 2----------");
		Phone phn2 =new Phone();
		phn2.brand="Samsung";
		phn2.model="XL";
		phn2.application="GooglePlayer";
		phn2.LTE=true;
		phn2.screen=4;
		
		phn2.call();
		phn2.text();
		phn2.intSurfing();
		
		System.out.println("--------------Phone 3----------");
		Phone phn3 =new Phone();
		phn3.brand="Nokia";
		phn3.model="G5";
		phn3.application="GooglePlayer";
		phn3.LTE=true;
		phn3.screen=6;
		
		phn3.call();
		phn3.text();
		phn3.intSurfing();
		
	}
	void call() {
		System.out.println("You can call with "+brand);
	}
	void text() {
		System.out.println("You can text with "+brand);
	}
	void intSurfing() {
		System.out.println("You can enter to internet with "+brand);
	}
}
