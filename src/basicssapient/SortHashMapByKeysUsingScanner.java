package basicssapient;

//Write a program to sort HashMap by keys
/*Apple 50 
Orange 20
Banana 10
Grapes 40
Papaya 50*/

import java.util.*;

public class SortHashMapByKeysUsingScanner {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println("Enter the size of the map: ");
		int mapSize = in.nextInt();
		
		System.out.println("Enter the key and values: ");
		for(int i=0; i<mapSize; i++) {
		
		String Fruit = in.next();
		int Price = in.nextInt();
		hm.put(Fruit, Price);
		
		}
//		System.out.println(hm);
		
		TreeMap<String, Integer> tm = new TreeMap<>(hm);

//		System.out.println(tm);

		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		
		
		
		

	}
}
