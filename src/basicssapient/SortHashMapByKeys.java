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

//		TreeMap<String, Integer> tm = new TreeMap<>();
//		tm.put("Apple", 50);
//		tm.put("Orange", 20);
//		tm.put("Banana", 10);
//		tm.put("Grapes", 40);
//		tm.put("Papaya", 50);
//
//		System.out.println(tm);

		System.out.println("****** String, Integer ***********");
		
		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("Apple", 50);
		hm.put("Orange", 20);
		hm.put("Banana", 10);
		hm.put("Grapes", 40);
		hm.put("Papaya", 50);

		TreeMap<String, Integer> tm = new TreeMap<>(hm);

//		System.out.println(tm);

		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("****** Integer, String***********");
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(50, "Apple");
		hm1.put(20, "Orange");
		hm1.put(10, "Banana");
		hm1.put(40, "Grapes");
		hm1.put(30, "Payaya");
		
		TreeMap<Integer, String> tm1 = new TreeMap<>(hm1);
		
		for(Map.Entry m:tm1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}

	}
}
