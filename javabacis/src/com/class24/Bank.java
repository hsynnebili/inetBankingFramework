package com.class24;


	//parent Class
	public class Bank {
		public int chargeInterest() {
			return 1;
		}
	}
	//1 child class
	class BOA extends Bank{
		@Override//annotation
		public int chargeInterest() {
			return 3;
		}
	}
	//2 child class
	class PNC extends Bank{
		@Override
		public int chargeInterest() {
			return 5;
		}
	}

