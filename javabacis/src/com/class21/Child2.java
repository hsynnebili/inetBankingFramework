package com.class21;


	public class Child2 extends Parent{

		
		
		public static void main(String[] args) {
			
			Child2 childObject=new Child2();
			System.out.println("Child 2 eye color "+childObject.eyeColor);
			System.out.println("Child 2 hair color "+childObject.hairColor);
			System.out.println("Child 2 has "+childObject.nose+" nose");
			childObject.sing();
			childObject.playTennis();
			
			Parent parentObject=new Parent();
			//parentObject.hairType --> not accessible in Parent Class
			//parentObject.playTennis()--> not accessible in Parent Class
			
		}
		
		public void playTennis() {
			System.out.println("Child 2 can swim");
		}
	}

