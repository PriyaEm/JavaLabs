package generalprograms;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// Check whether the given number is Prime or not

		int num = 3;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					count++;
				}
				if (count == 2) {
					System.out.println("Prime Number");
				} else {
					System.out.println("Not a prime number");
				}
			}
		} else
			System.out.println(" Not a prime number");
	}
}


