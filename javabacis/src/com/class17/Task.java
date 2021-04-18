package com.class17;

public class Task {
	
		
		public static void main(String[] args) {
			
			Task obj=new Task();
			obj.findLargest(12, 23);
			obj.evenOrOdd(333);
			obj.isPalindrome("madam");
				
			}
		void findLargest(int a,int b) {
			if(a>b) {
				System.out.println("A is larger than B");
			}else {
				System.out.println("B is larger than A");
			}
		}
		
		void evenOrOdd(int num) {
			if(num%2==0) {
				System.out.println(num+ " is an even number");
			}else {
				System.out.println(num+" is an odd number");
			}
		}
		void isPalindrome(String str) {
			String reverse="";
			for(int i=str.length()-1;i>=0; i--) {
				reverse += str.charAt(i);
			}
			if(reverse.equals(str)) {
				System.out.println(str+ " is a palindrome");
			}else {
				System.out.println(str+ " is not a palindrome");
			}
		}
		}