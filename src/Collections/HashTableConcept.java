package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// it is similar to hashmap, but it is synchronised.
		// stores the value on the basis of key-value pair
		// Key--Object--HashCode--Value
		// it contains only unique elements
		// it cannot have any null key or null values

		// 1st object
		Hashtable h1 = new Hashtable();
		h1.put(1, "Test");
		h1.put(2, "Automation");
		h1.put(3, "Selenium");

		// 2nd object
		Hashtable h2 = new Hashtable();

		// create clone copy/shallow copy:
		// to clone the 1st obj values in to 2nd obj
		h2 = (Hashtable) h1.clone(); //

		System.out.println("Values of h1:" + h1);
		System.out.println("Values of h2:" + h2);

		System.out.println("*********************");

		// to remove the values
		h1.clear();

		System.out.println("Values of h1:" + h1);
		System.out.println("Values of h2:" + h2);

		// contains method: used to check value is exist or not
		Hashtable ht1 = new Hashtable();
		ht1.put("A", "Maths");
		ht1.put("B", "Science");
		ht1.put("C", "English");

		if (ht1.containsValue("Maths"))
			System.out.println("Value is found");

		// print all the values from hashtable--using Enumeration concept--elements()
		// method
		Enumeration e = ht1.elements();
		System.out.println("Print values from ht using enumeration");

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable -- using entrySet() -- return set of hashtable values:
		
		System.out.println("Print values from ht using entry set");
		Set s = ht1.entrySet();
		System.out.println(s);
		
		Hashtable ht2 = new Hashtable();
		ht2.put("A", "Maths");
		ht2.put("B", "Science");
		ht2.put("C", "English");
		ht2.put("C", "English"); // it contains only unique values
//		ht2.put(null, "EVS"); // not allowed, throws NUll pointer exception
//		ht2.put("E", null); // not allowed, throws Null pointer exception
		
		System.out.println("Values from ht2:");
		System.out.println(ht2);
		
		
		//check both ht1 and ht2 are equal or not
		if(ht1.equals(ht2))
			System.out.println("Both are equal");
		
		//get the values from a key
		System.out.println(ht2.get("C"));
		
		//get the hashcode of hashtable object:
		System.out.println("Hashcode value of ht1:" + ht1.hashCode());
		System.out.println("Hashcode value of ht2:" + ht2.hashCode());
		
		//generics
		Hashtable<String, String> ht3 = new Hashtable<String,String>();
		
		
	}

}
