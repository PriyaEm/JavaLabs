package basicssapient;

import java.util.HashSet;

public class FirstRepeatingCharInAString {
	
	
	public static void main(String[] args) {
		
		String str ="geeksforgeeks";
		
		char[] arr = str.toCharArray();
		
		System.out.println(firstRepeating(arr));
	}
	
	
	static char firstRepeating(char[] str) {
		
		// create empty hashset
		
		HashSet<Character> h = new HashSet<>();
		
		// iterate 
		for (int i=0; i<str.length; i++) {			
			char c = str[i];
			
			if(h.contains(c)) {
				return c;
			}else
				h.add(c);
			
		}		
		
		return 0;
	}
	
	

}
