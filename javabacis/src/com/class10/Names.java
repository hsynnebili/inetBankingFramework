package com.class10;

public class Names {
public static void main(String[] args) {
	
	int a=2;
	
	String[]names= {"Alex","Carlos","Raul","Ronaldo","Guti"};
	System.out.println(names[a]);
	
	a+=2;
	System.out.println(names[a]);
	
	int size=names.length;
	System.out.println(size);
	
	
	String[]names1=new String[4];
	names[0]="Alex";
	names[1]="Carlos";
	names[2]="Raul";
	names[3]="Ronaldo";
	names[4]="Guti";
	System.out.println(names[3]);
	//  System.out.println(names[0]);
    //  System.out.println(names[1]);
    //  System.out.println(names[2]);
  for (int i=0; i<size; i++) {
      System.out.println(names[i]);
  }
  
	
}
}
