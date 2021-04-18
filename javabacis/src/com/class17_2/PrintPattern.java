package com.class17_2;

public class PrintPattern {
public static void main(String[] args) {
	PrintPattern obj=new PrintPattern();
	obj.print();
		
	}
void print() {
	for(int a=0; a<=9; a++) {
		for(int b=0;b<9;b++) {
			for(int c=0; c<9;c++) {
				for(int d=0; d<9; d++) {
					System.out.println(a+""+b+""+c+""+d);
					
				}
			}
		}
	}
}
}

