package generalprogamsusinguserinput;

import java.util.*;

public class ElementExistInAnArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Length of an array: " + n);
		
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Input array: " + Arrays.toString(a));
		
		int x = sc.nextInt();
		System.out.println("Key value: " + x);
		
		int count =0;
//		for(int i=0; i<n; i++) {
//			if(a[i]==x) {
//				count++;
//			}		
//			
//		}
//		if(count>=1) {
//			 System.out.println("true");
//			} else {
//			 System.out.println("false");
//			}
		
//		int i=0;
//		
//		
//		System.out.println(i);
//		while(a[i]!=x && i<a.length) {	
//			System.out.println(i);
//			i++;			
//		}
//		
//		if(i==n) {
//			System.out.println("false");
//		} else {
//			System.out.println("true");
//		}
			
		
		
		
		
		}

}
