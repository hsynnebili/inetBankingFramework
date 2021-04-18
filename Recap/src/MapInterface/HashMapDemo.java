package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "TestNG");
		hm.put(3, "Cucumber");
		hm.put(4, "SQL");

		System.out.println(hm.get(1));
		System.out.println(hm.get(3));

		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.remove(1);
		System.out.println(hm);

		System.out.println("========Employee Info===========");

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee emp1 = new Employee("Tom", 25, "admin");
		Employee emp2 = new Employee("John", 26, "QA");
		Employee emp3 = new Employee("Alex", 29, "Manager");
		Employee emp4 = new Employee("Brain", 35, "SuperVisor");
		Employee emp5 = new Employee("Timoty", 32, "Engineer");
		Employee emp6 = new Employee("Timoty", 32, "Engineer");

		emp.put(1, emp1);
		emp.put(2, emp2);
		emp.put(3, emp3);
		emp.put(4, emp4);
		emp.put(5, emp5);

		//System.out.println(emp);
		// traverse the hashmap
		for (Entry<Integer, Employee> emps : emp.entrySet()) {
			Integer key = emps.getKey();
			Employee empInfo = emps.getValue();
			System.out.println(key + ".Info: " + " " + empInfo.name + " " + empInfo.age + " " + empInfo.dept);
			// System.out.println(empInfo.name);
		}

		System.out.println("========Student Info===========");

		HashMap<Integer, Student> st = new HashMap<Integer, Student>();

		Student st1 = new Student("Julia", 123, 'A');
		Student st2 = new Student("Roger", 125, 'B');
		Student st3 = new Student("Hunk", 133, 'A');
		Student st4 = new Student("Cech", 136, 'B');
		Student st5 = new Student("Flory", 140, 'A');

		st.put(1, st1);
		st.put(2, st2);
		st.put(3, st3);
		st.put(4, st4);
		st.put(5, st5);

		for (Entry<Integer, Student> std : st.entrySet()) {
			Integer key1 = std.getKey();
			Student stInfo = std.getValue();

			System.out.println(key1 + ".Info= " + stInfo.name + " " + stInfo.number + " " + stInfo.branch);

		}

	}

}
