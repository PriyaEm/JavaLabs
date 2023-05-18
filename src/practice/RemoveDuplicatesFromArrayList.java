package practice;

import java.util.*;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		int[] arr = { 12, 35, 1, 10, 34, 1 };

		System.out.println(Arrays.toString(arr));

		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int a : arr) {
			set.add(a);
		}

		System.out.println(set);
	}
}
