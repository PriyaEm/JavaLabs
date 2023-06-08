package codingpractice;

//import java.util.Arrays;
//import java.util.Collection;
//
//public class DescendingOrder {
//
//	public static void main(String[] args) {
//
//		// extract the number from a String and sort in descending order
//
////		String input = "My name is nitin and 5radar 212 and  34racecar I speak malayalam";
//
////		String[] words = input.split(" ");
//
////		System.out.println(input.replaceAll("[^0-9]",""));
//
////		String digits = input.replaceAll("[^0-9]", "");
////
//////		char[] c = digits.toCharArray();
////
////		Arrays.sort(c);
//
////		System.out.println(c);
////		int n1 = c.length;
////		
//		int[] c = {45, 23, 10, 27, 98, 17};
//		
////		Arrays.sort(c);
////		System.out.println(Arrays.toString(c));
////		int n = c.length;
//		
//		
//		Arrays.sort(c,Collection.reverseOrder());
//		System.out.println(Arrays.toString(c));
//		
////		for(int i=0; i<n/2; i++) {
////			int temp = c[i];
////			c[i] = c[n-1-i];
////			c[n-1-i] = temp;				
////		}
//		
////		System.out.println(Arrays.toString(c));
//		
//		
//		
//
////		for (int i = 0; i < n; i++) { //98,45,27,23,10,17
////			for (int j = i + 1; j < n; j++) { //98,45,27,23,17,10
////				if (c[i] < c[j]) { // 45<23 f, 45<10 f, 45<98// 23<10, 23<27//27<45
////					int temp = c[i]; // 45, 23, 27
////					c[i] = c[j]; //98, 27, 45
////					c[j] = temp; //45, 23,23, 
////				}
////			}
////			System.out.print(c[i] + ",");
////		}
//		
//
//	}
//
//}


//import java.util.*;
//
//class DescendingOrder {
//    public static void main(String[] args)
//    {
// 
//        // Initializing the array
//        Integer array[] = { 1, 2, 3, 4, 5 };
// 
//        // Sorting the array in descending order
//        Arrays.sort(array, Collections.reverseOrder());
// 
//        // Printing the elements
//        System.out.println(Arrays.toString(array));
//    }
//}
