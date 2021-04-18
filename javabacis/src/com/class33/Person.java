package com.class33;

public class Person {
//	Create a Person class with following private fields: name, lastName, age, salary.
//	Variables should be initialized through constructor.
//	Inside the class also create a method to print user details.
//	In Test Class create a Map to store personId and a Person Object. Print each object details.	
	
private String name;
private String lastName;
private int age;
private int salary;

public Person(String name,String lastName,int age,int salary) {
	this.name=name;
	this.lastName=lastName;
	this.age=age;
	this.salary=salary;
	
}
public void printPersonDetails() {
	System.out.println("Name is "+name+"last name is "+lastName+"age is "+age+"salary is "+salary);
}
	
}
