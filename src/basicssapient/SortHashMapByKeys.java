package basicssapient;

//Write a program to sort HashMap by keys
/*Apple 50 
Orange 20
Banana 10
Grapes 40
Papaya 50*/

import java.util.*;

public class SortHashMapByKeys {
	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("Apple", 50);
		tm.put("Orange", 20);
		tm.put("Banana", 10);
		tm.put("Grapes", 40);
		tm.put("Papaya", 50);

		System.out.println(tm);
		
		

	}
}
