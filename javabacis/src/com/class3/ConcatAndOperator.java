package com.class3;

public class ConcatAndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int x=10;
		 
		int y=20;
		
		String a="Hello";
		String b="Bye";
		
		System.out.println(x+y+a+b);//30HelloBye;
		System.out.println(x+a+y+b);//10Hello20Bye;
		System.out.println(x+a+b+y);//10HelloBye20;
		System.out.println(a+b+x+y);//HelloBye30;HelloBye1020;won't work
		System.out.println(a+b+(x+y));//HelloBye30;
	
	*/
	
	//HelloBye + 10 = HelloBye10
		
		int a=15;
		int b=35;
		
		String x="Java Program";
		String y="Development";
		
		System.out.println(a+b+x+y);//50JavaProgramDevelopment;
		System.out.println(a+x+b+y);//15JavaProgram35Development;
		System.out.println(x+a+y+b);//JavaProgram15Development35;
		System.out.println(x+y+a+b);//JavaProgramDevelopment1535;
		System.out.println(x+y+(a+b));//JavaProgramDevelopment50;
		System.out.println(x+y+(a-b));//JavaProgramDevelopment-20;
	}

}
