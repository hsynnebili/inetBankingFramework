package com.class32;

import java.util.*;

public class SetOverwiew1 {
public static void main(String[] args) {
	System.out.println("-------treeSet---------");
	Set<String>classDays=new TreeSet<>();
	classDays.add("Monday");
	classDays.add("Tuesday");
	classDays.add("Wednesday");
	classDays.add("Thursday");
	classDays.add("Friday");
	classDays.add("Saturday");
	classDays.add("Sunday");
	
	System.out.println(classDays);
	System.out.println("---------for each---------");
	
	for(String days:classDays) {
		System.out.println(days);
	}
	System.out.println("----------iterator---------");
	Iterator<String>it=classDays.iterator();
	while(it.hasNext()) {
	System.out.println(	it.next());
		
	}
	
	System.out.println("-------treeSet---------");
	Set<String>classDays1=new HashSet<>();
	classDays.add("Monday");
	classDays.add("Tuesday");
	classDays.add("Wednesday");
	classDays.add("Thursday");
	classDays.add("Friday");
	classDays.add("Saturday");
	classDays.add("Sunday");
	
	
	
	
	
	
}
}
