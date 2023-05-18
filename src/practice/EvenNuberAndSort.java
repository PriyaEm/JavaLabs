package practice;

//find out all the even numbers and sort 
//them in ascending order.

import java.util.*;
//10 15 8 49 25 98 32

public class EvenNuberAndSort {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };

		// to sort an array
		Arrays.sort(arr);

		// System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
