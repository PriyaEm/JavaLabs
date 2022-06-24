package generalprograms;

public class CountNumberOfEvenandOddDigit {

	public static void main(String[] args) {
		// Count number of odd and even digits in a given number

		int num = 1234;
		int even = 0;
		int odd = 0;

		while (num > 0) {
			int rem = num % 10; // 1234/10 = 4, 123/10 = 3,12/10 = 2, 1/10 = 1
			if (rem % 2 != 0) {
				odd++; //1 2
			} else {
				even++;//1 2
			}
			num = num/10; //1234/10 = 123, 123/10 =12, 12/10 = 1,
		}
		System.out.println("Number of Even numbers:" + even);
		System.out.println("Number of Odd numbers:" + odd);
	}
}
