package com.class19;

public class Task {
	public static void main(String[] args) {
		
	
/*
 * Create a method createEmail().
 * Based on provides users name ,lastName and email type,
 * your method should return complete email Adress;
 * johnsnow@gmail.com
 * johnsnow@yahoo.com
  */
	Task obj=new Task();
	String email=obj.createEmail("Huseyin","Nebili","@gmail.com");
	System.out.println(email);
	
	 email=obj.createEmail("FatIh","Ari","@hotmail.com");
	System.out.println(email);

	}
	//return type methodName
	String createEmail(String name,String lastName,String emailType) {
		
		String email= name+lastName+emailType;
		return email.toLowerCase();
	}
}
