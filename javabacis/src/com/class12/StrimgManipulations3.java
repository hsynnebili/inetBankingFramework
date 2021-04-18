package com.class12;

public class StrimgManipulations3 {
public static void main(String[] args) {
	//char
	
	String str="Students";
	
	char character=str.charAt(0);
	System.out.println(character);
	
	for(int i=0; i<str.length();i++) {
		System.out.print(str.charAt(i)+",");
	}
	System.out.println();
	//
	System.out.println("--------indexOf----------");
	String str1="Sunday";
	int index=str1.indexOf("u");
	System.out.println(index);
	
	System.out.println("-----------------");
	
	
	String str2=" Syntax Technologies";
	
	System.out.println(str2.indexOf("Syntax"));
	System.out.println(str2.indexOf("Technologies"));
	System.out.println(str2.indexOf(" "));
	System.out.println(str2.indexOf("w"));
	
	//substring()- gives another string from your current String
	
	System.out.println("-------substring--------");
	
	String str3="Today is Sunday Java class";
	
	String newString=str3.substring(9);
	System.out.println(newString);
	
	System.out.println(str3.substring(0,5));//Today
	System.out.println(str3.substring(9,20));//Sunday Java
	System.out.println(str3.substring(16,20));//Java
	System.out.println(str3.substring(21));//class
	
}
}
