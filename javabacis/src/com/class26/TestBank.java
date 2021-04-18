package com.class26;

public class TestBank {
	public static void main(String[] args) {

		Bank obj = new Bank();
		System.out.println(obj.getBalance());

		BankA obj1 = new BankA();
		System.out.println(obj1.getBalance());

		BankB obj2 = new BankB();
		System.out.println(obj2.getBalance());

		BankC obj3 = new BankC();
		System.out.println(obj3.getBalance());

		System.out.println("----1.poliforism----");

		Bank b;
		b = new BankA();
		System.out.println(b.getBalance());

		System.out.println("----2.poliforism----");

		b = new BankB();
		System.out.println(b.getBalance());

		System.out.println("----3.poliforism----");

		b = new BankC();
		System.out.println(b.getBalance());
		
		

	}
}
