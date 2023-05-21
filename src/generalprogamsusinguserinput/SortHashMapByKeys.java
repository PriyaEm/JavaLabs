package generalprogamsusinguserinput;

//sort HashMap by keys 

import java.util.*;

public class SortHashMapByKeys {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String fruit = sc.next();
			int price = sc.nextInt();
			hm.put(fruit, price);
		}

//		System.out.println(hm);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

		TreeMap<String, Integer> tm = new TreeMap<>(hm);
//		System.out.println(tm);

		for (Map.Entry m1 : tm.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());

		}

	}
}
