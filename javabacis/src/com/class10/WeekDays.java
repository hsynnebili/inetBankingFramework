package com.class10;

public class WeekDays {
public static void main(String[] args) {
	
	
	
	String[]weekDays= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	for(int i=0; i<=weekDays.length-1; i++) {
		System.out.println(weekDays[i]);
	}
	System.out.println("--------------------------");
	
	String[]weekDays1=new String[7];
	weekDays1[0]="Monday";
	weekDays1[1]="Tuesday";
	weekDays1[2]="Wednesday";
	weekDays1[3]="Thursday";
	weekDays1[4]="Friday";
	weekDays1[5]="Saturday";
	weekDays1[6]="Sunday";
	
	for(int i=0; i<=weekDays1.length-1; i++) {
		System.out.println(weekDays1[i]);
	}
}
}
