package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSetCompare {

	public static void main(String[] args) {

		
		System.out.println("=======ArrayList==========");

		List<String> str0 = new ArrayList<String>();

		str0.add("BMW");
		str0.add("Mercedes");
		str0.add("BMW");
		str0.add("Toyota");
		str0.add("Ford");
		str0.add("Honda");
		str0.add(null);
		str0.add(null);

		for (int i = 0; i < str0.size(); i++) {
			System.out.println(str0.get(i));
		}
		List<Integer> str1 = new ArrayList<Integer>();
		str1.add(10);
		str1.add(20);
		str1.add(30);
		str1.add(40);
		str1.add(50);
		System.out.println("ArrayList numbers =" + str1);

		
		System.out.println("=======LinkedList==========");

		List<String> str2 = new LinkedList<String>();

		str2.add("BMW");
		str2.add("Mercedes");
		str2.add("BMW");
		str2.add("Toyota");
		str2.add("Ford");
		str2.add("Honda");
		str2.add(null);
		str2.add(null);
		

		//for (int i = 0; i < str2.size(); i++) {
			//System.out.println(str2.get(i));
	//	}
		System.out.println(str2);

		List<Integer> str3 = new LinkedList<Integer>();
		str3.add(10);
		str3.add(20);
		str3.add(30);
		str3.add(40);
		str3.add(50);
		System.out.println("LinkedList numbers =" + str3);

		
		System.out.println("=======HashSet==========");

		Set<String> str4 = new HashSet<String>();
		str4.add("BMW");
		str4.add("Mercedes");
		str4.add("BMW");
		str4.add("Toyota");
		str4.add("Ford");
		str4.add("Honda");
		str4.add(null);
		str4.add(null);
		System.out.println(str4);

		Set<Integer> str5 = new HashSet<Integer>();
		str5.add(10);
		str5.add(20);
		str5.add(30);
		str5.add(40);
		str5.add(50);
		System.out.println("HashSet numbers =" + str5);

		System.out.println("=======LinkedHashSet==========");

		Set<String> str6 = new LinkedHashSet<String>();
		str6.add("BMW");
		str6.add("Mercedes");
		str6.add("BMW");
		str6.add("Toyota");
		str6.add("Ford");
		str6.add("Honda");
		str6.add(null);
		str6.add(null);
		System.out.println(str6);

		Set<Integer> str7 = new LinkedHashSet<Integer>();
		str7.add(10);
		str7.add(20);
		str7.add(30);
		str7.add(40);
		str7.add(50);
		System.out.println("LinkedHashSet numbers =" + str7);

		System.out.println("=======TreeSet==========");

		Set<String> str8 = new TreeSet<String>();
		str8.add("BMW");
		str8.add("Mercedes");
		str8.add("BMW");
		str8.add("Toyota");
		str8.add("Ford");
		str8.add("Honda");
		//str8.add(null);
		System.out.println(str8);

		Set<Integer> str9 = new TreeSet<Integer>();
		str9.add(20);
		str9.add(20);
		str9.add(10);
		str9.add(40);
		str9.add(50);
		System.out.println("TreeSet numbers =" + str9);

	}

}
