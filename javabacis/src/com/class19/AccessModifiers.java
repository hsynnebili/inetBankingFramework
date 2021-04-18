package com.class19;

public class AccessModifiers {
	public static void main(String[] args) {
		
	
//Create a method that will take 1 parameter as a String and return reversed String. 
//Method should be visibly only within same package.
	
	AccessModifiers obj=new AccessModifiers();
	String reversed=obj.reverseString("Hello");
	System.out.println(reversed);
	
	
	System.out.println(obj.isPalindrome("mam"));
}
protected String reverseString(String str) {
	String reversed="";
	for(int i=str.length()-1;i>=0;i--) {
		reversed=reversed+str.charAt(i);
	}
	return reversed;
}


//Create a method that will take a String and return whether String is palindrome or not.
//Method should available to all classes within your projects.

public boolean isPalindrome(String str) {
	String reversed="";
	boolean flag=true;
	for(int i=str.length()-1;i>=0;i--) {
		reversed=reversed+str.charAt(i);
}
	if(reversed.equals(str)) {
		flag=true;
	}else {
		flag=false;
	}
	return flag;
}}
	





