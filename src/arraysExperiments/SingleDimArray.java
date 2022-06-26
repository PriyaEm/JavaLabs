package arraysExperiments;

import java.util.Arrays;

public class SingleDimArray {

	public static void main(String[] args) {

		// int[] a = new int[3]; // static array

		int[] a = { 15, 4, 3, 20, 1 }; // dynamic array

		System.out.println("Before sorting:" + Arrays.toString(a)); // to print on the console
		Arrays.sort(a);		//to arrange in order
		System.out.println("After sorting:" + Arrays.toString(a));

	}

}
