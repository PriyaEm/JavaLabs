package generalprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// N=7
		// 2 to n-1
		int n = 100;

		if (n > 1) {
			for (int i = 2; i <= n - 1; i++) { // i=2,3
				if (n % i == 0) { // 7/2,7/3.....7/6
					System.out.println("The given number is prime");
				} else {
					System.out.println("Prime");
				}
			}
		}
	}
}
