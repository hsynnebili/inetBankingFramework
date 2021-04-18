package com.class19;

public class Mail {
	public static void main(String[] args) {
		Mail obj=new Mail();
		char myGrade=obj.getGrade(76);
		
		System.out.println("My grade is= "+myGrade);
	}
	/*
	 * Create class student that will have a method getGrade;
	 * your method should accept the score of student and return a grade
	 *score>90-A
	 *score>80-B
	 *score>70-C
	 *score>50-D
	 *anything else-F 
	 */
	
char getGrade(int score) {
	char grade;
	if(score>90) {
		grade='A';
		
	}else if(score>80) {
		grade='B';
	}else if(score>70) {
		grade='C';
	}else if(score>50) {
		grade='D';
	}else {
		grade='F';
	}
	return grade;
}
}

