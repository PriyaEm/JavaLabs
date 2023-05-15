package arraysExperiments;

import java.util.Arrays;

public class SwapArrayElements {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 28, 13, 6 };

		System.out.println("Before swapping :" + Arrays.toString(arr));
		
		// to swap the element of 0th index and last index		
		swap(arr, 0, 4);

		System.out.println("After swapping :" + Arrays.toString(arr));

	}

	static void swap(int[] arr, int index1, int index2) {

		// Using a variable
//		int temp;
//
//		temp = arr[index1];
//		arr[index1] = arr[index2];
//		arr[index2] = temp;
		
		//Without using a variable
		
		arr[index1] = arr[index1] + arr[index2];
		arr[index2] = arr[index1] - arr[index2];
		arr[index1] = arr[index1] - arr[index2];
		
		//*****************************************************
	}

}
