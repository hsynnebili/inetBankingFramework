package com.class35;

import java.util.*;

public class StringBufferDemo {
public static void main(String[] args) {
		
		
//		StringBuffer sb=new StringBuffer("Hello");
//		
//		sb.deleteCharAt(3);
//		
//		System.out.println(sb);
		
//		String str="Good morning";
//		str = str.concat(" John");//str=new String("Good morning John")
//		System.out.println(str);
//		
//		System.out.println("------------");
//		
//		StringBuffer sb=new StringBuffer("Good morning");
//		sb.append(" John");
//		
//		System.out.println(sb);
	TreeSet map = new TreeSet();
	map.add("one");
	map.add("two");
	map.add("three");
	map.add("four");
	map.add("one");
	Iterator it = map.iterator();
	while (it.hasNext() ) 
	{
	System.out.print( it.next() + " " );
	}
	}
}
