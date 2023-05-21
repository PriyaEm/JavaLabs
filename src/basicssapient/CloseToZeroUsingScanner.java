package basicssapient;

import java.util.*;

public class CloseToZeroUsingScanner {
	
	public static void main(String[] args) {
		
//		int[] a = { -4, -2, 1, 4, 8};
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the array elements: ");
		String str = in.nextLine();
		
		String[] s = str.split(" ");
		
		int[] a = new int[s.length];
		for(int i=0; i<s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
			
		}
		
		Arrays.sort(a); 
				
		if(a[(a.length-1)]<0) { // 
			System.out.println("closest to zero: " + a[(a.length-1)]);
			
		}else {
			for(int i=0; i<a.length; i++) { //
				if (a[i]>0) {
					System.out.println("closest to zero: " +a[i]);
					break;
				}
				
			}
		}
		
	    
		
	}

}
