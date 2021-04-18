package com.class31;

public abstract class CreditCardd {

	public String creditCardName;

	public CreditCardd(String creditCardName) {
		this.creditCardName = creditCardName;

	}

	public void openAccount() {
		System.out.println("Open " + creditCardName + " credit card");

	}

	public abstract void interestRate();

	public abstract void annualFee();

}
class CapitalOne extends CreditCardd{
	
	public CapitalOne(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has ineterest rate of 25%");

		
		
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has annual fee of $250");
		
	}
	
}
class JNG extends CreditCardd{
	public JNG(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate of 22%");

	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has annual fee of $200");

		
	}
	
}

class Masterr extends CreditCardd{
	public Masterr(String creditCardName) {
		super(creditCardName);
		
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate of 20%");
		
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has NO annual fee");
		
	}
	
}
