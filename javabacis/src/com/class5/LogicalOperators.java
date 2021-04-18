package com.class5;

import java.util.Scanner;

public class LogicalOperators {
public static void main(String[] args) {
	/*if number is between 1-10 -->is small
	 * if number is between 11-100-->is medium
	 * if number is between 101-1000-->number is large
	 */
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter a number");
int num=scanner.nextInt();

if(num>1 && num<=10) {
System.out.println("number is small");
//true AND true-->true

}else if(num>=11 && num<=100) {
	System.out.println("number is medium");
	//false AND true-->false
	
}else if(num>101 && num<=1000)  {
	System.out.println("number is large");
}else {
	System.out.println("Number is not in our range");
}
}
}

