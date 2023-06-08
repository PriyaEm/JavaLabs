package codingpractice;

import java.util.*;

// reverse a String

public class ReverseaString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		
		char[] c = s.toCharArray();
		
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);			
		}
		
		System.out.println(rev);
		
	}

}
