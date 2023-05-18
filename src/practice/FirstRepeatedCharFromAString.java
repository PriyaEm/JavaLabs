package practice;

import java.util.HashSet;

public class FirstRepeatedCharFromAString {

	public static void main(String[] args) {

		String str = "geeksforgeeks";

		// convert the string to character Array
		char[] arr = str.toCharArray();

		System.out.println(firstRepeating(arr));
	}

	static char firstRepeating(char[] str) {

		// create an empty hashset

		HashSet<Character> h = new HashSet<>();
		for (int i = 0; i <= str.length; i++) {
			char c = str[i];
			
			
		//check if the element is present in the hashset
			if (h.contains(c)) {
				return c;
			} else { 
				h.add(c);
			}
		}
		return '\0';
	}
}
