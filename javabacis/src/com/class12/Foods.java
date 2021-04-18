package com.class12;

public class Foods {
	public static void main(String[] args) {
		String[][] grocery={
				{"apple","orange","banana","lemon"},
				{"cabbage", "carrot","cucumber"},
				{"milk","bread","meat"},
				{"seed","woolnut","almond"}
				

	};
		for(int i=0; i<grocery.length; i++) {
			for(int j=0; j<grocery[i].length;j++){
				
			System.out.print(grocery[i][j]+" ");
		}
			System.out.println();
			
	}
		
		
		System.out.println("-----------for each----------");
		for(String[] array:grocery) 
		{
			for(String food : array) {
				System.out.print(food+" ");
			}
			System.out.println();
		}
		
	
	}

}
