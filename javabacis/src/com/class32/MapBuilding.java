package com.class32;

import java.util.*;

public class MapBuilding {
	
public static void main(String[] args) {
	
	Map<Integer,String>map=new HashMap<>();
	
	map.put(1, "Geogle");
	map.put(2, "Syntax");
	map.put(2, "Syntax");
	map.put(3, "Youtube");
	map.put(4, "Instegram");
	map.put(5, "Saffari");
	map.put(6, "Geoogle Map");
	map.put(7, "Oracle");
	
	System.out.println(map.size());
	
	map.replace(4, "Udemy");
	
	map.remove(7);
	System.out.println(map);
}
}
