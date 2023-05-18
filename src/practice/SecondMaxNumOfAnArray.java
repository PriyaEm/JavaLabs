package practice;

//second maximum from Array 12 35 1 35 10 34 1

import java.util.*;

public class SecondMaxNumOfAnArray {

	public static void main(String[] args) {

//		int[] arr = { 1, 12, 35, 1, 35, 10, 34, 1 };
		
//		int[] arr = {35, 35, 35, 35};
		
		int[] arr = { -1, -12, -35, -1, 35, -10, 34, -1 };
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		
		for (int s:arr) {
			hs.add(s);			
		}
		
		System.out.println(hs);		
//		System.out.println(hs.size());
		
		if(hs.size()>1) {
		
		Integer[] newArr = new Integer[hs.size()];
		newArr = hs.toArray(newArr);
		
		System.out.println("Using LinkedHasSet: " + newArr[newArr.length-2]);
		
		}else {
			System.out.println("There is no second largest number");
		}
		
//		ArrayList<Integer> list = new ArrayList<>(hs);
//		
//		System.out.println(list);
//		
//		System.out.println(list.get(list.size()-2));	
		
		
		
		
		//*************************************************
		

//		 int[] arr={35, 35, 35, 35};
		Arrays.sort(arr);
		

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] > max) { // 1>35, false
				secondMax = max; //12
				max = arr[i]; // 35
			}

			if(arr[i]<max && arr[i] >secondMax) { // 1<35 && 1>12 //true
				secondMax = arr[i];		//34		
			}
		}
		System.out.println(secondMax);
		
//		int n =arr.length;
//		 System.out.println(Arrays.toString(arr));
//
//		 if(arr[n-1]!=arr[n-2]){
//		 System.out.println(arr[n-2] + " is the second largest number");
//		 } else{
//		 System.out.println(arr[n-3] + " is the second largest number");
//		 }
	}

}

 
