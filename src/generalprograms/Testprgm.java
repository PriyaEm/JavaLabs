package generalprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Testprgm {

	public static void main(String[] args) {
		String str = "Java Language Java Language Is Beautiful Language";

		// split
		// iterate, add, remove duplicates
		// LinkedHashSet
		// format output string

		// Create a LinkedHashSet for the Set interface reference
		Set<String> lHashSet = new LinkedHashSet<>();

		// Split into a STring array
		String[] s = str.split("\\s");
		// System.out.println(s);

		// Iterate and add the values in to LinkedHashSet

		for (String s1 : s) {
			lHashSet.add(s1);
		}

		// Print the LinkedHashSet
		System.out.println(lHashSet); // Java, Language, is, Beautiful

		// Formatting the output string (to remove Comma(,), [ and ] )
		String Output = lHashSet.toString().replace(",", "").replace("[", "").replace("]", "");
		System.out.println(Output);

//		System.out.println("The Input string is : " + str);
//		System.out.println("The Output string is : " + Output.replace(",","").replace("[", "").replace("]",""));

	}

}
