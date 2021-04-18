package com.class26;


	class Parent{
		  static void m1(){
		    System.out.println("Parent m1()");
		  }
		}

		class Child extends Parent{
		  static void m1(){
		    System.out.println("Child m1()");
		  }
		}

		class InSameClassCallingOverriden {
		  public static void main(String[] args) {
		   Child cc= new Child();
		   cc.m1();
		  }
		}


