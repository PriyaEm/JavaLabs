package practice;

//Find min-max value from an unsorted array

import java.util.*;

public class MinMaxValueOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 };

		int minVal = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minVal) {
				minVal = arr[i];
			}
		}
		System.out.print(minVal + " ");

		int maxVal = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println(maxVal);
	}

}
