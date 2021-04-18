package com.class26;

public class Bank {

	public int getBalance() {
		return 0;
	}
}

class BankA extends Bank {
	public int getBalance() {
		return 1000;
	}
}

class BankB extends Bank {
	public int getBalance() {
		return 1500;
	}
}

class BankC extends Bank {
	public int getBalance() {
		return 2000;
	}
}