package com.class11;

import java.util.Scanner;

public class WeekDays {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter 7 elements");
	
	String[] weekDays=new String[7];
	System.out.println();
	
	for(int i=0; i<weekDays.length; i++) {
		weekDays[i]=scanner.nextLine();
	}
	
	for(int i=weekDays.length-1;i>=0; i--) {
		System.out.println(weekDays[i]+" ");
		
}
}}
