package com.class31;

import java.util.*;
import java.util.List;

public class ArrayListManipulateAndReturn {

	public static ArrayList<String> list() {

		ArrayList<String> names = new ArrayList<>();
		names.add("Shiva");
		names.add("Sandish");
		names.add("Asel");

		return names;

	}
	public static void main(String[] args) {
		
		ArrayList<String>lists=list();
		System.out.println(lists);
	}
}
