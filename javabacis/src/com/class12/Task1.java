package com.class12;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		/*
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your username and password");
		String userName = scanner.nextLine();
		String password = scanner.nextLine();

		String str2 = "";
		if (!userName.isEmpty() && !password.isEmpty()) {

			if (password.length() >= 8) {
				if (!password.contains(userName)) {
					System.out.println("Please confirm password.");
					String confirmedPassword = scanner.nextLine();
					if (password.equals(confirmedPassword)) {
						System.out.println("You done, username and password were stored.");
					} else {
						System.out.println("Confirmed password does not match password.");
					}
				} else {
					System.out.println("Password can not contain username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Username and Password cannot be empty");
		}
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter user name ");
		String userName=scanner.nextLine();
		
		System.out.println("Please enter your password");
		String password=scanner.nextLine();
		
		
		if(!userName.isEmpty() && !password.isEmpty()) {
			if(password.length()>=8) {
				if(!password.contains(userName)) {
					System.out.println("Please confirm password");
					String confirmedPassword=scanner.nextLine();
					if(password.equals(confirmedPassword)) {
						System.out.println("Your password is valid");
						
					}else {
						System.out.println("Confirmed password does not match the password");
					}
					
				}else {
					System.out.println("Password can not contain username");
				}
				
			}else {
				System.out.println("It is too short");
			}
			
		}else {
			System.out.println("Username or password can not be empty");
		}
		
		
		
	}
}
