package com.class29;

public class EncapsulationDemoTest {
	public static void main(String[] args) {
		
		EncapsulationDemo obj = new EncapsulationDemo();
		
		obj.setEmpName("John");
		obj.setEmpAge(30);
		System.out.println("Employee Name= "+obj.getEmpName());
		System.out.println("Employee Age= "+obj.getEmpAge());
	}
}
