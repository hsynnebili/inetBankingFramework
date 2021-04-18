package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplaceName {
	public static void main(String[] args) {
		
		ArrayList<String>names=new ArrayList<String>();
		
		names.add("Alex");
		names.add("Jhon");
		names.add("William");
		names.add("Stewe");
		
		
		Iterator<String>it=names.iterator();
		for(int i=0;i<names.size();i++) {
			String name=it.next();
			if(name.contains("l") || name.contains("t")) {
				names.set(i, "Fred");
			}
		}
		System.out.println(names);
	}

}
