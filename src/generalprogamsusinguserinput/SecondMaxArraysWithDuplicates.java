package generalprogamsusinguserinput;

//find 2nd maximun from array with duplicates

import java.util.*;

public class SecondMaxArraysWithDuplicates {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println("Length of an array:" + n);

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(a).replace(",", "").replace("[", "").replace("]", ""));

		Arrays.sort(a);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		for (int a1 : a) {
			lhs.add(a1);
		}

		Integer[] arr = new Integer[lhs.size()];

		lhs.toArray(arr);
		
		System.out.println(Arrays.toString(arr));

		if (arr.length > 1) {
			System.out.println("Output:" + arr[arr.length - 2]);
		} else {
			System.out.println("Output : -1");
		}

	}
}