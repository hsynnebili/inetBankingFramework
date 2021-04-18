package com.class17;

public class ScannerMethod {
	 public static void main(String[] args) {
	        ScannerMethod scnMthd = new ScannerMethod();
	        System.out.println(scnMthd.sum(125, 150));
	        scnMthd.example();
	        scnMthd.example2("");
	        scnMthd.example3();
	        scnMthd.example4("");
	        scnMthd.example5("");
	        scnMthd.example6('a');


	    }

	    private int sum(int i, int j) {
		
		return i+j;
	}

		void example() {

	        System.out.println("No return value and NO Parameters");
	    }

	    void example2(String name) {

	        System.out.println("No return value but with Parameter : " + name);
	    }

	    boolean example3() {

	        System.out.println("With return value and NO Parameters");
	        return true;
	    }

	    String example4(String name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return name;
	    }
	    
	    
	    boolean example5(String name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return false;
	    }
	    
	    
	    long example6(char name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return name;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

