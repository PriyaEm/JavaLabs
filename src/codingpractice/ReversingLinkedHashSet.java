package codingpractice;

import java.util.*;
import java.io.*;

public class ReversingLinkedHashSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int n = sc.nextInt();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		System.out.println("Enter the values: ");
		
		for(int i=0; i<n; i++) {
		int value = sc.nextInt();
		lhs.add(value);		
		}
		System.out.println(lhs);
		
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		
		ts.addAll(lhs);
		
		System.out.println(ts);
		
		

	}

}

//Java Program to sort LinkedHashSet elements
//in descending order

//Importing java generic libraries
//import java.util.*;
//import java.io.*;
//
////Class
//public class ReversingLinkedHashSet {
//
//	// Main driver method
//	public static void main(String[] args)
//	{
//		// Creating and Initializing LinkedHashSet
//		Set<Integer> linkhasset
//			= new LinkedHashSet<Integer>();
//
//		// Adding elements to above LinkedHashSet
//		// Custom inputs
//		linkhasset.add(26);
//		linkhasset.add(23);
//		linkhasset.add(24);
//		linkhasset.add(21);
//		linkhasset.add(25);
//		linkhasset.add(22);
//
//		// TreeSet storing elements in descending order by
//		// adding all elements of HashSet in reverse order
//		TreeSet<Integer> ts
//        = new TreeSet<>(Collections.reverseOrder());
//
//		// Add all elements from LinkedHashSet to TreeSet
//		ts.addAll(linkhasset);
//
//		// Print all elements of TreeSet
//		System.out.println("Element in descending order : "
//						+ ts);
//	}
//}
//
