package com.class12;

public class StringManipulagtions2 {
public static void main(String[] args) {
	
	String str="Good morning,students";
	boolean contains=str.contains("students");
	System.out.println(contains);
	
	String present="Welcome,Mehmet";
	String neededValue="WELCOME";
	
	boolean flag=present.contains(neededValue);
	System.out.println(flag);
	
	boolean flag1=present.toLowerCase().contains(neededValue);
    System.out.println(flag1);

    System.out.println("---------StartWith & EndWith------");
    String str1="syntax";
    
    boolean starts=str1.startsWith("s");
    System.out.println(starts);
    
    System.out.println(str1.startsWith("X"));
    
    //
    System.out.println("-------------isEmpty()------------");
    String str2="";
    boolean isEmpty=str2.isEmpty();
    System.out.println(isEmpty);
    
    //concat()-->will concatenate 1 string to the end another
    System.out.println("---------concat()--------");
    String str3="Hello ";
    String str4="Ali!";
    
    System.out.println((str3+str4));
    System.out.println(str3.concat(str4));
    
    //
    System.out.println("__________----____________");
    String expected="You may qualify for a multi-policy discount!";
    String actual=" You may qualify for a multi-policy discount!";
    
    actual=actual.trim();
    System.out.println(expected.equals(actual));
    
    
    
    
    
    
    
}
}
