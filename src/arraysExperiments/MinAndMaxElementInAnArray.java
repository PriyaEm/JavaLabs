package arraysExperiments;

import java.util.Arrays;

public class MinAndMaxElementInAnArray {

	public static void main(String[] args) {

		int a[] = { 100, 50, 25, 7, 45 };

		int n = a.length;
			
		//before sorting
		System.out.println("Before Sorting :" + Arrays.toString(a));
		Arrays.sort(a);
		
		//after sorting
		System.out.println("After Sorting :" + Arrays.toString(a));
		int x = n-1;
		System.out.println(a[0] + "  is the min number in an array");
		System.out.println(a[x] + "  is the max number in an array");		
	}
}
