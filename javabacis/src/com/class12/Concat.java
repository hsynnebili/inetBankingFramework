package com.class12;

import java.util.Scanner;

public class Concat {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	String banana=scanner.nextLine();
	
	String str="the first 3 letters of ";
	str=str.concat("banana ").concat("is ").concat("ban ");
	System.out.println(str);
}
}
