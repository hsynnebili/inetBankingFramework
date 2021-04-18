package com.class11;

public class Recap {
public static void main(String[] args) {
	//let's create an array of names thats will hold 5 elements and retrieve all values
	
	String[]names=new String[7];
	
	names[0]="Asel";
	names[1]="Awet";
	names[2]="Arif";
	names[3]="Wegas";
	names[4]="Dzmitri";
	names[5]="Shiva"; //will get an runtime exception when trying to access it
	names[6]="Sandesh";
	
	
	for(int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}System.out.println("--------------------------");
	// 2.create an array using array literal
	
	String[]studentNames= {"Shaban","Bilal","Mehmet","Zaki","Samir","Frank"};
	for(int i=0; i<=studentNames.length-1; i++) {
		System.out.println(studentNames[i]);
		
		}
	
	//retrive values using advanced loop,for each loop,enhanced for loop
	
	System.out.println("------------Advanced for loop-----------");
	for(String student:studentNames) {
		System.out.println(student);
	}
	
	System.out.println("-------Week Days-----------");
	String[]weekDays= {"Monday","Tuesday","Wenesday","Thursday","Friday","Saturday","Sunday"};
	for(String days:weekDays) {
		System.out.println(days);
		
	}
}
}
