package basicssapient;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] arr = {15, 26, 6, 7, 27, 38};
		
		
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
