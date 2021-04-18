package com.class23;

public class Employee {
	public static String department="IT";

	 int salary;//default oldugu icin diger paketlerde cagiramiyoruz.
	
	protected int salary1;//protected oldugu icin diger paketlerden eger akrabalik var ise(miras) cagirabiliriz.
	

	public void getPaid() {//cagirirken object olusturularak cagirilir.orn:ScrumTeam st=new ScrumTeam(); st.getPaid
		System.out.println("Employee get's paid " + salary);
	}
	
	public static void work() {//cagirirken object olmadan cagirilabilir.Developer.work();
		System.out.println("Hi there");
	}
}

