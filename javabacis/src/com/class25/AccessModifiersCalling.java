package com.class25;

public class AccessModifiersCalling {
	
		  private void m1(){
		    System.out.println("This is Private Method");
		  }
		  void m2(){
		    System.out.println("This is Default Method");
		  }
		  protected void m3(){
		    System.out.println("This is Protected Method");
		  }
		  public void m4(){
		    System.out.println("This is Public Method");
		  }
		  
		  public static void main(String[] args) {
			  AccessModifiersCalling mm= new AccessModifiersCalling();
		    mm.m1();
		    mm.m2();
		    mm.m3();
		    mm.m4();
		   
		  }
		}

