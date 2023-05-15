package practiceBasics;

import java.util.Arrays;

public class ConcatenateTwoArrays {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		
		int length = array1.length + array2.length;
		System.out.println(length);

		int[] result = new int[length];
		
		//Version 1 - without arraycopy
		/*
		 * int index = 0;
		 * 
		 * for(int array:array1) { result[index] = array; index++; }
		 * 
		 * for(int array:array2) { result[index] = array; index++; }
		 * 
		 * System.out.println(Arrays.toString(result));*/
		
		// version 2 - using arraycopy
		
		int a1Len = array1.length;
		int a2Len = array2.length;
		
		// source = array1, src position =0, destination = result, des position =0, length = length of array1) 
		System.arraycopy(array1, 0, result, 0, a1Len);
		
		// source = array2, src position =0, destination = result, des position =array1 length, length = length of array2) 

		System.arraycopy(array2, 0, result, a1Len, a2Len);
		
		System.out.println(Arrays.toString(result));	
		
		
		
		

	}
}
