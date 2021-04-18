package com.class18;

public class ApplicationCalculator {
public static void main(String[] args) {
	
	Calculator calc=new Calculator();
	System.out.println("Sum is = "+(calc.sum(12,14,16)));
	System.out.println("Average is= "+(calc.average(12,14,16)));
	System.out.println("Min is= "+(calc.min(12,14,16)));
	System.out.println("Max is= "+(calc.max(12,14,16)));
}
}
