package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept<E> {

	public static void main(String[] args) {

		int[] i = new int[3];// static array===>size is fixed...

		// dynamic array===>ArrayList:
		// 1.can contain duplicate values/elements
		// 2.maintains insertion order
		// 3.Synchronized
		// 4.allows random access to fetch the element because it stores the values on
		// the basis of indexes.

		ArrayList ar = new ArrayList();

		ar.add(10);
		ar.add(20);
		ar.add(30);

		System.out.println(ar.size());
		System.out.println(ar.get(2));

		ar.add(40);
		ar.add(50);

		System.out.println(ar.size());
		System.out.println(ar.get(4));

		ar.add("Tom");
		ar.add('A');
		ar.add(true);

		System.out.println(ar.size());

		System.out.println("============");
		for (int j = 0; j < ar.size(); j++) {
			System.out.println(ar.get(j));

		}

		// Integer

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);

		System.out.println("Integer:" + ar1);

		// generic

		Employee e1 = new Employee("Naveen", 12, "QA");
		Employee e2 = new Employee("Syntax", 10, "MT");
		Employee e3 = new Employee("Naveeen2", 14, "DT");

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// iterator to traverse the values
		System.out.println("======Iterator===========");

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name + " " + emp.age + " " + emp.dept);
		}

		// advanced for loop

		System.out.println("=====advanced for loop=======");
		for (Employee emp : ar4) {
			System.out.println(emp.name + " " + emp.age + " " + emp.dept);
		}

		// String
		ArrayList<String> st = new ArrayList<String>();
		st.add("BMW");
		st.add("VW");
		st.add("Toyota");
		st.add("Mercedes");
		System.out.println("String :" + st);

		// for loop
		for (int j = 0; j < st.size(); j++) {
			System.out.println(st.get(j));
			System.out.println("1th index car :" + st.get(1));
			System.out.println(st.size());

		}

		// Iterator
		Iterator<String> it1 = st.iterator();
		while (it1.hasNext()) {
			String st1 = it1.next();
			System.out.println("With Iterator: " + st1);
		}

		// for advanced
		for (String st1 : st) {
			System.out.println(st);

		}

		System.out.println("=====the last===========");

		ArrayList<String> job = new ArrayList<String>();
		job.add("plumber");
		job.add("engineer");
		job.add("teacher");
		job.add("carpenter");
		job.add("nurse");

		System.out.println("job size is " + job.size());
		System.out.println("job 3th element is " + job.get(3));

		System.out.println("=====jobs with for loop===========");

		for (int k = 0; k < job.size(); k++) {

			System.out.println(job.get(k));

		}

		System.out.println("====job with iterator======");

		Iterator<String> jb = job.iterator();
		while (jb.hasNext()) {
			String jobs = jb.next();
			System.out.println(jobs);
		}

		System.out.println("======job with for advance=========");

		for (String jbs : job) {
			System.out.println(jbs);

		}

	}
}