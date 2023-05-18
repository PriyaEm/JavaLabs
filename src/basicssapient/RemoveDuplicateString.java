package basicssapient;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		// expected output = "Java Languaga is beautiful";

		String str = "Java Language Java Language is beautiful";

		// split the words and add into an array
		// traverse
		// use set to remove duplicates
		// print

		String[] s = str.split("\\s");

		LinkedHashSet<String> hs = new LinkedHashSet<>();

		for (String s1 : s) {
			hs.add(s1);
		}

		String result = hs.toString().replace(",", " ").replace("[", " ").replace("]", " ");
		System.out.println(result);

	}

}
