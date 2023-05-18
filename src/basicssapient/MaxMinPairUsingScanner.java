package basicssapient;

import java.util.*;

public class MaxMinPairUsingScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of an Array :");
		int n = scanner.nextInt(); // length of an array		

		System.out.print("Enter the array elements : ");		
		Scanner scanner1 = new Scanner(System.in);
		String s = scanner1.nextLine();
		
		System.out.println(s);
		
		String[] str = s.split(" ");	 // String Array		
		
//		System.out.println(Arrays.toString(str));	
		
		int[] arr = new int[n]; // int array
		
		for(int i=0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);			
		}
		
//		System.out.println(Arrays.toString(arr));	
		
		int minVal = arr[0];
		int maxVal = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < minVal) {
				minVal = arr[i];				
			}
			
			if(arr[i] > maxVal) {
				maxVal = arr[i];				
			}
			
		}
		
		
		System.out.println(minVal + " " + maxVal);
		
	}
}
