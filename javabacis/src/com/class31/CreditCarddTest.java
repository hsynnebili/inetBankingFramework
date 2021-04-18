package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCarddTest {

	public static void main(String[] args) {

		CreditCardd cone = new CapitalOne("CapitalOne Platinum");
		CreditCardd jng = new JNG("JNG Master Card");
		CreditCardd master = new Masterr("Master Unlimited");

		ArrayList<CreditCardd> card = new ArrayList<CreditCardd>();

		card.add(cone);
		card.add(jng);
		card.add(master);

		for (int i = 0; i < card.size(); i++) {
			card.get(i).openAccount();

			card.get(i).annualFee();
		}
		System.out.println("--------------------");
		for (CreditCardd ccard : card) {
			System.out.println(ccard.creditCardName);
		}
		System.out.println("--------------------");
		Iterator<CreditCardd> it = card.iterator();

		while (it.hasNext()) {
			it.next().annualFee();
		}

		System.out.println("--------------------");
		Iterator<CreditCardd> itt = card.iterator();
		while (itt.hasNext()) {
			itt.next().openAccount();
		}
	}
}