package CollectionsListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConceptPart2 {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("Testing");
		ar1.add("Selenium");
		ar1.add("Automation");
		ar1.add("JUnit");

		ArrayList<String> ar2 = new ArrayList<String>();

		ar2.add("TestNG");
		ar2.add("Cucumber");

		// to combine two arraylists
//		ar1.addAll(ar2);
//		System.out.println(ar1);

		// to add from specific index
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);

		// clear method: used to clear the arraylist or create an empty arraylist
//		 ar1.clear();
//		 System.out.println(ar1);

		// to clone the particular array list
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);

		// contains method: used to check whether the elements is there or not
		System.out.println(ar1.contains("Testing"));
		System.out.println(ar1.contains("Development"));

		// indexof method: used to check whether the elements is there or not
		System.out.println(ar1.indexOf("JUnit") > 0); // output: true / false

		// create an arraylist with values in a line
		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("Ganesh", "Anees", "Ganesh", "Ramesh", "Anish", "Ganesh"));
		System.out.println(list1);

		// last index of method "Ganesh"
		int i = list1.lastIndexOf("Ganesh");
		System.out.println(i);
		int j = list1.lastIndexOf("Rajesh");
		System.out.println(j); // if it is not available, then give -1.

		// to remove the value on the basis of index or value
		list1.remove(2);
		list1.remove("Ramesh");
		System.out.println(list1);

		// given a list and remove all even numbers and print only odd numbers
		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		number1.removeIf(num -> num % 2 == 0);
		System.out.println(number1); // prints only odd numbers

		// given a list and remove all odd numbers and print only even numbers
		ArrayList<Integer> number2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		number2.removeIf(num -> num % 2 != 0);
		System.out.println(number2); // prints only odd numbers

		// retainALl method
		ArrayList<String> namesList = new ArrayList<String>(
				Arrays.asList("Ganesh", "Anees", "Ganesh", "Ramesh", "Anish", "Ganesh"));
		System.out.println(namesList);
		namesList.retainAll(Collections.singleton("Ganesh"));
		System.out.println(namesList);

		// how to create a sublist
		ArrayList<Integer> number3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
		ArrayList<Integer> subList = new ArrayList<Integer>(number3.subList(3, 6)); // fromIndex, inclusive, and
																					// toIndex, exclusive
		System.out.println(subList);

		// toArray method -- how to convert an arraylist to an array
		ArrayList<String> newList = new ArrayList<String>(
				Arrays.asList("Ganesh", "Anees","Ramesh", "Anish", "Vinoth"));
		
		Object ar[] = newList.toArray(); // return single dimentoon array
		System.out.println(Arrays.toString(ar));
		
		//print all the values using for each loop
		for(Object o:ar) {
		System.out.println(o);
		}
		
		
		
	}

}
