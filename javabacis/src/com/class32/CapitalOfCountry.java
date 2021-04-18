package com.class32;

import java.util.*;

public class CapitalOfCountry {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("England", "London");
		map.put("France", "Paris");
		map.put("Germany", "Berlin");
		map.put(null,null);
		map.put(null, "Berlin");
		map.put("USA", null);
		map.put("Canada", null);
		
		

		System.out.println("---------HashMap---------------");
		
		//	HashMap stores the elements in random order
		//  HashMap allows maximum one null key and multiple null values.
	    //  HashMap interface does not allow duplicate keys however allows duplicate values.
		
		for (Map.Entry<String, String>entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());

		}
		
		Map<String,String>map2=new LinkedHashMap<>();
		
		map2.put("England", "London");
		map2.put("France", "Paris");
		map2.put("Germany", "Berlin");
		map2.put("Norway", "Oslo");
		map2.put(null,null);
		map2.put(null, "Berlin");
		map2.put("USA", null);
		map2.put("Canada", null);
		
		
        System.out.println("---------LinkedHashMap---------------");
		
		//	LinkedHashMap stores the elements in insertion order
		//  LinkedHashMap allows maximum one null key and multiple null values.
        //  LinkedHashMap interface does not allow duplicate keys however allows duplicate values.
		
		for(Map.Entry<String, String>entry:map2.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
Map<Integer,String>map3=new TreeMap<>();
		
		map3.put(1, "London");
		map3.put(3, "Paris");
		map3.put(4, "Berlin");
		map3.put(2, "Oslo");
	    //map3.put(null,null);       The compile will give an error. 
		//map3.put(null, "Berlin");  The compile will give an error. 
		map3.put(5, null);
		map3.put(6, null);
		map3.put(7, "London");
		
		
        System.out.println("---------TreeMap---------------");
		
		//	TreeMap stores the keys in ascending order.
	    //  TreeMap does not allow any null keys but allows multiple null values.
        //  TreeMap interface does not allow duplicate keys however allows duplicate values.
		
		for(Map.Entry<Integer, String>entry:map3.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
}
