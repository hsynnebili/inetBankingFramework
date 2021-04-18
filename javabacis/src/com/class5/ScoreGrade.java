package com.class5;

import java.util.Scanner;

public class ScoreGrade {
public static void main(String[] args) {
	
	int midTerm;
	int quiz;
	int finalGrade;
	int average;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter quiz score: ");
	quiz=scanner.nextInt();
	
	System.out.println("Please enter mid term score: ");
	midTerm=scanner.nextInt();
	
	System.out.println("Please enter final score: ");
	finalGrade=scanner.nextInt();
	
	average = (quiz+midTerm+finalGrade)/3;
	
	    if(average>=90) {
		System.out.println("Your grade is A ");
	    }else if(average>=70 && average<90) {//false OR true-->true
		System.out.println("Your grade is B");
		}else if(average>=50 && average<70) {
			System.out.println("Your grade is C");
		}else {
			System.out.println("Your grade is F");
		}
		}
}

