package StringMethods;

public class ToCharArray {

	public static void main(String[] args) {
		String s1 = "Welcome to Java";

		char[] ch = s1.toCharArray();
		int len = ch.length;

		System.out.println("Char Array length: " + len);
		System.out.println("Char Array elements: ");

		for (int i = 0; i < len; i++) {
			System.out.println(ch[i]);
		}

		// to print the same use print method instead of println
		String s2 = "hello";

		char[] c = s2.toCharArray();
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(c[i]);
		}
	}
}
