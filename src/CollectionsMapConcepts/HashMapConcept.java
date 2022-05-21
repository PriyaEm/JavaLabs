package CollectionsMapConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implements Map Interface
		// extends AbstractMap
		// it contains only unique elements
		// stores the values in the form of key-value pair
		// it may have one null key and multiple null values
		// it maintains no order
		// hashmap is non-synchronised -- it is not thread safe
		// concurrent modification exception - Fail-Fast condition

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Smoke");
		hm.put(2, "Sanity");
		hm.put(3, "Unit");
		hm.put(4, "System");

		// to print all the values
		System.out.println(hm);

		// to get the value
		System.out.println(hm.get(1));

		// to iterate all the values in hashmap using for loop
		for (Entry m : hm.entrySet()) { // m is the reference value
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// to remove any one key-value
		hm.remove(3);
		System.out.println(hm);

		// Employee class objects
		Employee e1 = new Employee("Ram", 25, "admin");
		Employee e2 = new Employee("Guru", 28, "Maths");
		Employee e3 = new Employee("Sai", 20, "IT");

		// creating hashmap in terms of key-value pair

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// Traverse the hashmap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();

			System.out.println("Employee " + key + " Info:");
			System.out.println(e.name + " " + e.age + " " + e.dept);

		}

	}

}
