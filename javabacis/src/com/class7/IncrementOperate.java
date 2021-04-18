package com.class7;

public class IncrementOperate {
	public static void main(String[] args) {
		/*
		 * int x=1; x=x+1;
		 * 
		 * System.out.println(x);//2
		 * 
		 * int y=1; y+=1; System.out.println(y);//2
		 * 
		 * int z=1; z++; System.out.println(z);//2
		 * 
		 * int w=2; w++; System.out.println(w);//3
		 * 
		 * int v=10; v--; System.out.println(v);//9
		 * 
		 * int a=10; int b=++a;//preincrement=first increment-->assign
		 * 
		 * System.out.println("Value of b is "+b);//11
		 * System.out.println("Value of a is "+a);//11
		 * 
		 * int c=10; int d=c++;//postincrement=first assign-->increment
		 * 
		 * System.out.println("Value of d is "+d);//10
		 * System.out.println("Value of c is "+c);//11
		 * 
		 * int q=100; int e =q--;
		 * 
		 * System.out.println("Value of e is "+e);//100 or 99?
		 * System.out.println("Value of q is "+q);//99
		 * 
		 * int h=50; int g=--h;//first decrement -->assign
		 * 
		 * System.out.println("Value of h is "+h);//49 or 50?
		 * System.out.println("Value of g is "+g);//49 or 50
		 */

		int x = 1;
		x = x + 1;
		System.out.println(x);

		int y = 1;
		y += 1;
		System.out.println(y);

		int z = 1;
		z++;
		System.out.println(z);

		int w = 2;
		w++;
		System.out.println(w);

		int v = 10;
		v--;
		System.out.println(v);

		int a = 10;
		int b = ++a;// pre-increment=first increment-->assign

		System.out.println("Value of b is " + b);// 11
		System.out.println("Value of b is " + a);// 11

		int c = 10;
		int d = c++;// post-increment=first assign-->increment

		System.out.println("Value of b is " + d);// 10
		System.out.println("Value of b is " + c);// 11
		
		
		int q=100;
		int e=q--;
		
		System.out.println(e);//100
		System.out.println(q);//99
		
		int h=50;
		int g=--h;//first decrement-->assign
		
		System.out.println(g);//49
		System.out.println(h);//49

	}
}
