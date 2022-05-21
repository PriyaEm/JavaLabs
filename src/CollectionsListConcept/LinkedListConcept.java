package CollectionsListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add:
		ll.add("test");
		ll.add("maths");
		ll.add("science");
		ll.add("english");

		// length or size
		System.out.println(ll.size());

		// print:
		System.out.println("Contents of LinkedList:" + ll);

		// addFirst method:
		ll.addFirst("EVS");

		// addLast Method:
		ll.addLast("drawing");

		System.out.println("Contents of LinkedList:" + ll);

		// get method:
		System.out.println(ll.get(0));

		// set method
		ll.set(0, "CS");
		System.out.println(ll.get(0));

		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of LinkedList:" + ll);

		// remove from specific position
		ll.remove(1);
		System.out.println("Contents of LinkedList:" + ll);

		// how to print all the values of for loop

		// for loop
		System.out.println("********Using for loop******");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}

		// advanced for loop
		System.out.println("********Using advanced for loop******");
		for (String str : ll) {
			System.out.println(str);
		}

		// Iterator
		System.out.println("********Using Iterator******");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// while loop
		System.out.println("********Using while loop******");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

		// Employee class objects

		Employee e1 = new Employee("Ram", 25, "admin");
		Employee e2 = new Employee("Guru", 28, "Maths");
		Employee e3 = new Employee("Sai", 20, "IT");

		// creating linkedlist
		LinkedList<Employee> ll1 = new LinkedList<Employee>();

		ll1.add(e1);
		ll1.add(e2);
		ll1.add(e3);

		// Iteration to traverse the values
		Iterator<Employee> it1 = ll1.iterator();
		while(it1.hasNext()) {
			Employee emp = it1.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);			
		}

	}

}
