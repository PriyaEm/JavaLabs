package exerciseprograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RempoveDuplicateAndReverseAString {

	public static void main(String[] args) {

		String str = "ritwik";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);			
		}
		
		
		char[] c = rev.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		//to remove duplicates
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		
		for(char x:c) {
			lhs.add(x);			
		}
		System.out.println(lhs);
		
		

	}

}
