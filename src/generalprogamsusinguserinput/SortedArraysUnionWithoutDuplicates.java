package generalprogamsusinguserinput;

//two sorted arrays union without duplicates

import java.util.*;

public class SortedArraysUnionWithoutDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the lenght of 1st array: ");
		int n1 = sc.nextInt();

		System.out.println("Enter the lenght of 2nd array: ");
		int n2 = sc.nextInt();

		int[] a1 = new int[n1];
		System.out.println("Enter the 1st arrays elements: ");
		for (int i = 0; i < n1; i++) {
			a1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a1));

		int[] a2 = new int[n2];
		System.out.println("Enter the 2nd array elements: ");
		for (int j = 0; j < n2; j++) {
			a2[j] = sc.nextInt();

		}
		System.out.println(Arrays.toString(a2));

		int[] a3 = new int[n1 + n2];

		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (a1[i] < a2[j]) {
				a3[k++] = a1[i++];

			} else
				a3[k++] = a2[j++];
		}

		while (i < n1) {
			a3[k++] = a1[i++];

		}
		while (j < n2) {
			a3[k++] = a2[j++];
		}

		System.out.println(Arrays.toString(a3));

		// converting to set to remove duplicates
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for (int a : a3) {
			lhs.add(a);
		}

		System.out.println(lhs);

	}
}