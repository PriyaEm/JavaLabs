package generalprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class NewSetCollection {

	public static void main(String[] args) {
		String str = "Java Language Java Language Is Beautiful Language";

		

		Set<String> set = new LinkedHashSet<>();
		String[] s = str.split("\\s");
		//System.out.println(s);
		for (String s1 : s) {
			set.add(s1);
//			System.out.println(s1);
		}
//		System.out.println(set); // Java, Language, is, Beautiful
		String Output = set.toString();
		
		System.out.println("The input string is:" + str);
		System.out.println("The Output string is:" + Output.replace(",", ""));

	}
}
