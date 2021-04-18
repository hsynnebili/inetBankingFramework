package com.class16;

public class Computer {

	String os,brand;
	boolean mouse,keyboard;
	int screen,ram;
	
	
	public static void main(String[] args) {
		//ClassName variableName=new ClassName();
			//1 object
		Computer comp1=new Computer();
		comp1.mouse=true;
		comp1.keyboard =true;
		comp1.os="Windows";
		comp1.ram=8;
		comp1.screen=2;
		comp1.brand="HP";
		
		
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		
		System.out.println("---------Computer 2-----------");
		//2 object 
		Computer comp2=new Computer();
		comp2.mouse=false;
		comp2.keyboard =false;
		comp2. os="Mac OS";
		comp2.screen=4;
		comp2.ram=6;
		comp2.brand="Apple";
		comp2.watchMovie();
		comp2.playMusic();
		comp2.doJavaCoding();
		
		
}
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand);
	}
	void doJavaCoding() {
		System.out.println("We can study Java on a computer "+brand);
	}
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}
}