package StringMethods;

public class SplitMethod {

	public static void main(String[] args) {

		String str = "Hello World";

		String[] s1 = str.split("\\s"); // it will split the above string

		for(String s : s1) {
			System.out.println(s);
		}
	}
}
