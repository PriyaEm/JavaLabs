package CollectionsSetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		// can't create an object for interface
		// cast to Set reference to create a hashset

		Set<String> hs = new HashSet<String>();

		hs.add("Maths");
		hs.add("English");
		hs.add("Science");
		hs.add("Maths"); // duplicates will be ignored
		hs.add(null);

		System.out.println(hs);
		// to check Maths available are not
		System.out.println(hs.contains("Maths")); // true/false

		// print all the values
		System.out.println("*****Using advanced for loop");
		for (String e : hs) {
			System.out.println(e);
		}

		System.out.println("*****Using Iterator");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		// to remove a value
		hs.remove("English");
		System.out.println(hs);

		// Set the Union:-- Union means combining both the sets
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 5, 7, 9, 10 }));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1, 2, 4, 5, 6, 8, 10 }));
		
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union); //Set will remove the duplicate values
		
		System.out.println("--------------------------");
		
		//get the intersection elements: get the common values
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		System.out.println("--------------------------");
		//get the differences
		
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
		
		

	}

}
