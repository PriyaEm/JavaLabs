package arraysExperiments;

import java.util.Arrays;

public class ReverseAnArrayDynamic {

	public static void main(String[] args) {

		int[] arr = { 15, 9, 16, 67, 5, 45, 7 };

		int n = arr.length;
		
		System.out.println(n);

		System.out.println(Arrays.toString(arr));

		int temp; 
		for (int i = 0; i < n/2; i++) {	
				
			temp=arr[i];
			arr[i]=arr[(n-1)-i];
			arr[(n-1)-i]=temp;	
			
			System.out.println(arr[i]);
			System.out.println(arr[n-1]);
	}
	
	System.out.println(Arrays.toString(arr));

}
}
