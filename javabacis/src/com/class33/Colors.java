package com.class33;

import java.util.*;

public class Colors {
	public static void main(String[] args) {
		
//		Set<String>numbers=new HashSet<>();
		
//		colors.add("Red");
//		colors.add("Pink");
//		colors.add("Yellow");
//		colors.add("White");
//		colors.add("Black");
//		
//		
//			System.out.println("Original  Hash Set: "+colors);
//			System.out.println("Size of the Hash Set: " +colors.size());
		
//		Set<Integer>numbers=new HashSet<>();
//		numbers.add(111);
//		numbers.add(111);
//		numbers.add(111);
//		numbers.add(999);
//		numbers.add(999);
//		numbers.add(999);
//		
//		for(Integer num:numbers) {
//			System.out.println(num);
//		}
		
//		Set<String>numbers1=new HashSet<>();
//		numbers1.add("first");
//		numbers1.add("second");
//		numbers1.add("third");
//		numbers1.add("fourth");
//		numbers1.add("fifth");
//		
//		System.out.println("HashSet contains:"+numbers1);
		//numbers1.remove("second");
		
//		System.out.println(numbers1);
//		numbers1.clear();
//		System.out.println(numbers1);
//		
		
		
//		Iterator<String>it=numbers1.iterator();
//		while(it.hasNext()) {
//			String m=it.next();
//			System.out.println(m);
//			
//		}
//		System.out.println("Does HashSet contains first element?"+numbers1.contains("first"));

		
		Set<String>numbers1=new HashSet<>();
		numbers1.add("first");
		numbers1.add("second");
		numbers1.add("third");
		numbers1.add("fourth");
		numbers1.add("fifth");
		
		System.out.println("HashSet contains:"+numbers1);
		
		String[]numbers2=new String [numbers1.size()];
		numbers1.toArray(numbers2);
		
		for(String num:numbers2) {
			System.out.println(num);
		}
		//System.out.println("Array elements:"+numbers2);
	}
}

