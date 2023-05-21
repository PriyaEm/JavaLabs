package generalprogamsusinguserinput;

//duplicate character in a string

import java.util.*;

public class DuplicateCharInAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] c = str.toCharArray(); // a a b b c c

		LinkedHashSet<Character> lhs = new LinkedHashSet<>();

		for (int i = 0; i < c.length; i++) {

			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					lhs.add(c[i]); // a b c
				}

			}
		}

		for (char item : lhs) {
			System.out.print(item + " ");

		}
	}
}