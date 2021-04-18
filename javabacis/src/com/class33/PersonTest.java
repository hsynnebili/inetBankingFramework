package com.class33;

import java.util.*;

public class PersonTest {
public static void main(String[] args) {
	
	Map<Integer,Person>person=new HashMap<>();
	person.put(1, new Person("John","Smith",32,58000));
	person.put(2, new Person("Nurbanu","Bostan",20,120000));
	person.put(3, new Person("Jackson","Snow",43,130000));
	person.put(4 , new Person("Fred","Ashel",49,128000));
	
	Collection<Person>personValues=person.values();
	for(Person per:personValues) {
		per.printPersonDetails();
	}
	
}
}
