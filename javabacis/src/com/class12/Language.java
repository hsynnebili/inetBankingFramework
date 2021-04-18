package com.class12;

import java.util.Scanner;

public class Language {
public static void main(String[] args) {
	
	String language1="Java";
	String language2="C";
	String language3="C++";
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter any programming language");
	String language=scanner.nextLine();
	
	if(language.equals(language1)) {
		System.out.println("Java is a programming language");
	}else if(language.equals(language2)) {
		System.out.println("C is a procedural programming language");
	}else if(language.equals(language3)) {
		System.out.println("C++ is a middle-level programming language");
	}else {
		System.out.println("Doesn't match any programming language");
	}
}
}
