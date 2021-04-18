package com.class14;

public class ReverseString {
public static void main(String[] args) {
	// Reverse a String without using a reverse function
	System.out.println("---------using a reverse function------------");
	String original ="Today is Java Class";
	String reverse1="";
	
	char[] array=original.toCharArray();
	
	for(int i=array.length-1; i>=0;i--) {
		reverse1=reverse1+array[i];
		
	}
	System.out.println("Reversed String is: "+reverse1);
	
	
	// 2 using charAt()
	System.out.println("--------- using charAt()------------");
    String reverse2="";
    
    for(int i=original.length()-1; i>=0; i--) {
        reverse2=reverse2+original.charAt(i);
    }
    System.out.println("Reversed String is: "+reverse2);
   
    // using substring()
    System.out.println("------------using substring()---------");
    String reverse3="";
    for(int i=original.length(); i>0; i--) {
        
        reverse3=reverse3+original.substring(i-1,i);
   } System.out.println("Reversed String is: "+reverse3);
}
}
