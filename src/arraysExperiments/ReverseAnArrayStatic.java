package arraysExperiments;

import java.util.Arrays;

public class ReverseAnArrayStatic {

	public static void main(String[] args) {

		int[] arr = { 15, 9, 16, 67, 5, 45 };

		System.out.println(Arrays.toString(arr));
		
		swap(arr, 0, 5);
		swap(arr, 1, 4);
		swap(arr, 2, 3);
		
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr, int index1, int index2) {

		int temp;

		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
