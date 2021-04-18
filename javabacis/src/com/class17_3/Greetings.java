package com.class17_3;

public class Greetings {
public static void main(String[] args) {
	
	
Greetings obj=new Greetings();
obj.hello();
//hello to find largest number
obj.helloToInstructor("Huseyin");
obj.findLargest(20,10);
obj.findLargest(30,30);
obj.findLargest(123, 124);

}
void hello() {
	System.out.println("Hello");
}
void helloToInstructor(String name) {
	System.out.println("Hello "+name);
}
void findLargest(int a,int b) {
	

if(a>b) {
	System.out.println("A is larger than B");
}else if(a==b){
	
	System.out.println("A is equal  B");
}else {
	System.out.println("B is larger than A");
}
}
public void evenOrOdd(int i) {
	// TODO Auto-generated method stub
	
}

}

