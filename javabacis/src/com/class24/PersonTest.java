package com.class24;

public class PersonTest {
	public static void main(String[] args) {
		
		PEmployee e = new PEmployee();

		e.name = "Joe";
		e.lastName = "Smith";
		e.age= 35;
		e.salary = 35000;
		e.print();

		PStudent s = new PStudent();

		s.name = "Adam";
		s.lastName = "Smith";
		s.age= 15;
		s.grade = 10;
		s.print();

		PRetiree r = new PRetiree();

		r.name = "Frank";
		r.lastName = "Smith";
		r.age= 15;
		r.seniorActivity = "tour";
		r.print();

			}	
}
