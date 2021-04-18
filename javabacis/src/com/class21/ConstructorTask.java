package com.class21;


public class ConstructorTask {
	private ConstructorTask() {   //bu const. private oldugu icin baska bir siniftan cagirilamaz sadece ayni sinifta cagirilir.
		System.out.println("Huseyin is very smart");
	}
	public static void main(String[] args) {
		ConstructorTask obj=new ConstructorTask();
		
		//obj.ConstructorTask();//for method not const.
	}
}

  
	
