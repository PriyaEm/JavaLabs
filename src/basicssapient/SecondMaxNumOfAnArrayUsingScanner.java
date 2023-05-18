package basicssapient;

//second maximum from Array 12 35 1 35 10 34 1

import java.util.*;

public class SecondMaxNumOfAnArrayUsingScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array of integers: ");
		String str = sc.nextLine();
		
		String[] s = str.split(" ");
		
		int[] arr = new int[s.length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);			
		}

		
		System.out.println("Before sorting: " + Arrays.toString(arr));		
		Arrays.sort(arr);
		System.out.println("After sorting: " +Arrays.toString(arr));
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		
		for (int a:arr) {
			hs.add(a);			
		}
		
		System.out.println("LHS: " +hs);		
//		System.out.println(hs.size());
		
		if(hs.size()>1) {
		
		Integer[] newArr = new Integer[hs.size()];
		newArr = hs.toArray(newArr);
		
		System.out.println("Second largest number: " + newArr[newArr.length-2]);
		
		}else {
			System.out.println("-1");
		}
		
	
		
		//*************************************************
		

//		 int[] arr={35, 35, 35, 35};
//		Arrays.sort(arr);
//		
//
//		int max = Integer.MIN_VALUE;
//		int secondMax = Integer.MIN_VALUE;
//		
//		
//		for (int i = 0; i < arr.length; i++) { 
//			if (arr[i] > max) { // 1>35, false
//				secondMax = max; //12
//				max = arr[i]; // 35
//			}
//
//			if(arr[i]<max && arr[i] >secondMax) { // 1<35 && 1>12 //true
//				secondMax = arr[i];		//34		
//			}
//		}
//		System.out.println(secondMax);
//		
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

 
