package CollectionsListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// Dynamic in nature. i.e. Dynamic array
		// can contain duplicate values/elements
		// maintains insertion order
		// not synchronized.. hence array list will be slow when compared to other
		// collections
		// allows random access to fetch the element, because it stores the
		// values/elements on the basis of indexes.

		int a[] = new int[3];// static array -- normal array

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		System.out.println(a[2]);

		// ArrayList default class is available, we can create an object for ArrayList

		ArrayList ar = new ArrayList();

		ar.add(10);
		ar.add(20);
		ar.add(30);

		System.out.println(ar.size());

		ar.add(40);
		ar.add(50);
		ar.add(50);// it will accept duplicate values

		System.out.println(ar.size()); // size of array
		System.out.println(ar.get(3)); // to get value from an index
		System.out.println("LI=" + 0);
		System.out.println("HI=" + (ar.size() - 1));

		// to print all the values from Arraylist
		// 1. for loop
		// 2. using iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}

		// non generic vs generic
		// non generic means creating the object for an arraylist without mentioning the
		// data type
		// generic means, arraylist with data type

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Selenium");

		// if we are not sure about which data type to use, then use "E"

		// ArrayList<E> ar3 = new ArrayList<E>();

		// How to define user defined class object ArrayList //very important
		// Employee class objects
		Employee e1 = new Employee("Ram", 25, "admin");
		Employee e2 = new Employee("Guru", 28, "Maths");
		Employee e3 = new Employee("Sai", 20, "IT");

		// create arraylist
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// Iteration to traverse the values:

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.print(emp.name + " ");
			System.out.print(emp.age + " ");
			System.out.println(emp.dept + " ");
		}

		System.out.println("************************");

		// ***********************************************
		// addAll method in ArrayList

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Maths");
		a1.add("Eng");
		a1.add("EVS");

		ArrayList<String> b1 = new ArrayList<String>();
		b1.add("PE");
		b1.add("CS");
		b1.add("Drawing");

		// to add both the arrayList

		a1.addAll(b1);

		// to print all the values in a1 arrayList

		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i)); // to print one by one
		}

		// to remove all the b1 arraylist values from a1

		System.out.println("*****************");

		a1.removeAll(b1);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}

		System.out.println("*****************");

		// retainAll method -- only common values will be printed

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("test");
		a2.add("selenium");
		a2.add("qtp");

		ArrayList<String> b2 = new ArrayList<String>();
		b2.add("test");
		b2.add("java");

		a2.retainAll(b2);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a2.get(i));
		}

	}

}
