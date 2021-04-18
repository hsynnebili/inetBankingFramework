package com.class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {

	public static void main(String[] args) {

		Insurance obj = new CarInsurance("Geico", "Toyota");
		Insurance obj2 = new PetInsurance("Progressive", "Dog");
		Insurance obj3 = new HealthInsurance("Kaiser");

		List<Insurance> insList = new ArrayList<>();
		insList.add(obj);
		insList.add(obj2);
		insList.add(obj3);
		
		System.out.println("------for loop-------");
		for (int i = 0; i < insList.size(); i++) {
			System.out.println(insList.get(i).insuranceName);
		}
		
		System.out.println("-----advance for loop----");
		for (Insurance ins : insList) {
			ins.getQuote();
			ins.cancelInsurance();
		}
		System.out.println("----iterator----");
		Iterator<Insurance> it = insList.iterator();
		while (it.hasNext()) {
			
			
			Insurance ins = it.next();

			ins.getQuote();
			ins.cancelInsurance();
		}
	}
}
