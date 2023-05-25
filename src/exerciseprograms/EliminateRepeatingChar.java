package exerciseprograms;

import java.util.*;

public class EliminateRepeatingChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.next();

		char[] c = str.toCharArray();
		System.out.println(Arrays.toString(c));

		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
				
		for(char c1:c) {
			lhs.add(c1);			
		}
		System.out.println(lhs);		
	}
}
