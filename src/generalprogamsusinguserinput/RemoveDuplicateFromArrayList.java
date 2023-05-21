package generalprogamsusinguserinput;

//remove duplicate from arraylist

import java.util.*;

public class RemoveDuplicateFromArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(a).replace(",", "").replace("[", "").replace("]", ""));

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		for (int a1 : a) {
			lhs.add(a1);
		}

		// System.out.println(lhs);
		for (int item : lhs) {
			System.out.print(item + " ");

		}
	}
}
