package com.class32;

import java.util.*;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;

public class ConverToSet {
	public static void main(String[] args) {
		
	
	List<String>aList=new ArrayList<String>();
	
	aList.add("Jane");
	aList.add("Jane");
	aList.add("Alex");
	aList.add("Alex");
	aList.add("Sharon");
	aList.add("Sharon");
	
	Set<String>aSet=new HashSet<String>(aList);
	System.out.println(aSet);
	
	Set<String>bSet=new LinkedHashSet<String>(aList);
	System.out.println(bSet);
	

}
}