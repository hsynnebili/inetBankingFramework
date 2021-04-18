package com.class24;

public class Employeee {

	String name = null;
	String lastName = null;
	int emloyeeId = 0;
	String startDate = null;
	int salary = 0;

	public Employeee() {

		System.out.println(name + " " + lastName + " " + emloyeeId + " " + startDate + " " + salary);
	}

	public Employeee(String name, String lastName, int employeeId, String startDate, int salary) {
		name = "Joe";
		lastName = "Smith";
		employeeId = 12345;
		startDate = "01/01/1970";
		salary = 35000;

		System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
	}

}
