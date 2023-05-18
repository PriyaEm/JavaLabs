package basicssapient;

import java.util.Arrays;
import java.util.LinkedHashSet;

//Given two sorted arrays, print their union without duplicate

public class SortedArrayUnion {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 4, 5, 7 };
		int[] arr2 = { 2, 3, 5, 6 };

		int n1, n2;
		n1 = arr1.length;
		n2 = arr2.length;

		int[] arr3 = new int[n1 + n2];

		int i = 0, j = 0, k = 0;

//		while (i < n1 && j < n2) {
//			if (arr1[i] < arr2[j]) {
//				arr3[k++] = arr1[i++];
//			} else if (arr1[i] > arr2[j]) {
//				arr3[k++] = arr2[j++];
//			} else {
//				arr3[k++] = arr1[i++];
//				j++;
//			}
//		}
		
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			} 
		}

		while (i < n1) {
			arr3[k++] = arr1[i++];
		}

		while (j < n2) {
			arr3[k++] = arr2[j++];
		}

		System.out.println(Arrays.toString(arr3));

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		for (int a : arr3) {
			lhs.add(a);
		}		
		System.out.println(lhs);
	}
}
