package basics;

import java.util.Arrays;

//yet to solve
public class NoOfOccuranceOfaString {

	public static void main(String[] args) {

		String str = "Java Language Java Language Is Beautiful Language";

		// split the words into an array
		// condition - java = java , count ++
		// print count

		String[] s = str.split("\\s");

		System.out.println(Arrays.toString(s));

		int len = s.length;

		System.out.println(len);

		int count = 0;

		for (int i = 0; i < len; i++) {
			if (s[i] == "java") {
				count++;

			}

		}

		System.out.println(count);

	}

}
