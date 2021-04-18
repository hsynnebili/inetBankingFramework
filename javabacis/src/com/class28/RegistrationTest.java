package com.class28;

public class RegistrationTest {
	public static void main(String[] args) {

		Registration reg = new Registration();
		 
		reg.setEmail("huseyinnebili@gmail.com");
		reg.setUserName("huseyin");
		reg.setPassword("12344567");
		

		System.out.println(reg.getEmail()+" "+(reg.getUserName()+" "+(reg.getPassword())));
	}
}
