package generalprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetJavaCollection {

	public static void main(String[] args) {
		String str = "This Is Java Selenium Java Selenium Interview";
		System.out.println("Input String:" + " " + str);

		String[] array = str.split("\\s");

		/*Set<String> set = new HashSet<String>();

		ArrayList<String> alist = new ArrayList<>();
		
		int i = 0;

		for (String a : array) {
			boolean test = set.add(a);

			if (test) {
				alist.add(i, a);
//				System.out.println(i + a);
				i++;
			}
//			System.out.println(test);
		}
		System.out.println(alist);
		String result = alist.toString();
		System.out.println("Output String:" + result.replace(",", ""));*/
		
		
		//using LinkedHashSet
		
		Set<String> lHSet = new LinkedHashSet<String>();
		
		for(String a:array) {
			lHSet.add(a);		
		}
		System.out.println(lHSet);
		String result = lHSet.toString();
		System.out.println(result.replace(",", ""));
	}
}