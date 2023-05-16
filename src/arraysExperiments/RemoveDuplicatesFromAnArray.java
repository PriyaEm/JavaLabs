package arraysExperiments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 21, 14, 5, 3, 8};
		
		System.out.println(Arrays.toString(arr));
		
		//length of an array
		int n = arr.length;
		
//		System.out.println(n);
		
		//to remove duplicates from an array
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		//version 1
//		for (int i=0; i<n; i++) {			
//		set.add(arr[i]);					
//		}	
		
		//version 2
		
		for(int e : arr) {
			set.add(e); 		
		}		
		System.out.println(set);
	}
}
