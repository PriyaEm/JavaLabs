package generalprograms;

public class PalindromeStringOrNot {

	public static void main(String[] args) {
		// Check whether the given string is palindrome or not

		String str = "nitin";
		String oString = str;
		String s = "";

		int len = str.length();
		System.out.println(len);

		for (int i = len - 1; i >= 0; i--) {
			s = s + str.charAt(i);
		}
		System.out.println(s);
		System.out.println(oString);
		if (oString.equals(s)) {
			System.out.println(oString + " "  + "is a Panlindrome String");
		} else {
			System.out.println(oString + " " + "is a not a Palindrome String");
		}
	}
}
