package arraysExperiments;

import java.util.Arrays;

// yet to solve - keep only unique

public class RemoveDuplicatesFromAnArrayUsingXoR {

	public static void main(String[] args) {
	
		int[] arr = {2, 3, 4, 5, 2, 4, 3 };
		
		System.out.println(Arrays.toString(arr));
		
		int i = 0;
		
		for(int e : arr) {			
			i ^= e;			
		}		
		System.out.println(arr[i]);
	}
}
