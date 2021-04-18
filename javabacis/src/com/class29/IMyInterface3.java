package com.class29;

interface IMyInterface3 {
	void m1();

}

interface IMyInterface4 {
	
	void m2();

}

interface Main2 extends IMyInterface4, IMyInterface3 {

	@Override
	public void m1() ;

	@Override
	public void m2();

}

class MainConcept implements Main2{

	@Override
	public void m1() {
		System.out.println(" abc");
	}

	@Override
	public void m2() {
		System.out.println(" def");
		
	} 
	
	
}