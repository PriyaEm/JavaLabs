package practice;

import java.util.Arrays;

public class MaxMinPairOfUnsortedArray {
	
	public static void main(String[] atgs) {

	int[] arr = {12, 35, 1, 10, 34, 1};
	
//	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	
//	System.out.println(Arrays.toString(arr));
	
	System.out.println(arr[0] + " " + arr[arr.length-1]);
	
//	System.out.println("Max value of an array is : " + arr[arr.length-1]);
	
	}	

}
