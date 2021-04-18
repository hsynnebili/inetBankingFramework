package com.class17_2;

public class Palindrome {
public static void main(String[] args) {
	
	
	Palindrome obj=new Palindrome();
	obj.Palindrome("Wadam");
	
	
}

void Palindrome(String str) {
	String reverse="";
	for(int i=str.length()-1; i>=0; i--) {
	
	reverse +=str.charAt(i);
	}
	if(reverse.equalsIgnoreCase(str)) {
		System.out.println(str+ " is a palindrome");
	}else {
		System.out.println(str+ " is not palindrome");
	}
	
	
}
}

