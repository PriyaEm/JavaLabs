package exerciseprograms;

import java.util.*;

public class DuplicateCharInAString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();

		char[] c = str.toCharArray();

		LinkedHashSet<Character> lhs = new LinkedHashSet<>();

		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					lhs.add(c[i]);
				}
			}
		}

		System.out.println(lhs);
	}
}
