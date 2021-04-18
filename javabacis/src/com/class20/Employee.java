package com.class20;

public class Employee {

	String eID;
	double salary;
	public static String ceo="Sumair";
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.eID="AB1234";
		emp1.salary=85000;
		emp1.getEmployeeInfo();
		
		System.out.println("-------------------");
		
		Employee emp2=new Employee();
		emp2.eID="AB5678";
		emp2.salary=95000;
		emp2.getEmployeeInfo();
		
	}

	private void getEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("CEO "+ceo+"\nEmpoyee ID "+eID+"\nSalary "+salary);
	}
}
