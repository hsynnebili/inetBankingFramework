package com.class33;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;


public class MapFromArray {

	public static void main(String[] args) {
		// 1 2 3 4 5 6
		String[] names = { "Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny" };

		Map<Integer, String> nameMap = new LinkedHashMap<>();

		int key = 1;

		for (String name : names) {
			nameMap.put(key, name);
			key++;
		}
		//System.out.println(nameMap);
		// print key and values using entrySet(loop && Iterator)
		
		Iterator<Map.Entry<Integer,String>>it=nameMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> name=it.next();
			//String names1 = name.getKey() +"="+ name.getValue();
			System.out.println(name);
			//System.out.println(names1);
		}
	}

}
