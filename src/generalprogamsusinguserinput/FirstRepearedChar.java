package generalprogamsusinguserinput;

//first repeated character from string

import java.util.*;

public class FirstRepearedChar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (i + 1 < c.length) {
				if (c[i] == c[i + 1]) {
					System.out.println(c[i]);
					break;
				}
			} else {
				System.out.println("0");

			}

		}

	}
}