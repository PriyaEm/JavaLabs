package basicssapient;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateCharTrials {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the input string : ");
		String input = sc.next();		
			
		char[] arr = input.toCharArray();
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		
		for(char a:arr) {
			lhs.add(a);			
		}
		
//		Iterator<Character> it = lhs.iterator();
//		while(it.hasNext()) {
////			System.out.print(it.next() + " ");
//			int count=0;
//			for(int j=0; j<arr.length; j++) {
//				if(it.next()==arr[j]) {
//					count++;					
//				}				
//			}
//			if(count>1) {
//				System.out.print(it.next() + " ");
//				
//			}
//			
//		}
		
		
		
		
//		char[] c = new char[lhs.size()];	
//		
//		int k=0;
//		for(char ls:lhs) {
//			c[k++] = ls;
//		}
		
//		System.out.println(Arrays.toString(c));
		
		
		
	}

}



//for(int i=0; i<c.length; i++) {
//	int count=0;
//	for(int j=0; j<arr.length; j++) {
//		if(c[i]==arr[j]) {
//			count++;					
//		}				
//		
//	}
////	System.out.println(count);
//	if(count>1) {
//		System.out.print(c[i] + " ");
//		
//	}
//}

