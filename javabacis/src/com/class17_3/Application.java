package com.class17_3;

import com.class17.Calculator;
import com.class17_2.ScannerMethod;

public class Application {
	public static void main(String[] args) {
		ScannerMethod scnMthd=new ScannerMethod();
		
		Calculator operations = new Calculator();
		
		int x=133, y=100;
		int d=operations.sum(x,y);
		System.out.println("Sum ="+d);
		
		int e=operations.sub(x,y);
		System.out.println("sub= "+e);
		
		int f=operations.mult(x,y);
		System.out.println("mult ="+f);
		

		int h=operations.div(x,y);
		System.out.println("div= "+h);
	}
	
}
	

