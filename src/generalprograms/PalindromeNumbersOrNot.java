package generalprograms;

public class PalindromeNumbersOrNot {

	public static void main(String[] args) {
		/// Check whether the given number is palindrome or not

		int num = 146412;
		int number = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

		if (number == rev) {
			System.out.println(number + " " + " is a Palindrome Number");
		} else {
			System.out.println(number + " " + "is not a Palindrome Number");
		}
	}
}
