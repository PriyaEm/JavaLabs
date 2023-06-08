package codingpractice;

public class FibonacciSequence {
	public static void main(String[] args) {

		// 0, 1, 1, 2, 3, 5, 8, 13, 21...

		int a = 0, b = 1, c = 1;

		int num = 10;

		for (int i = 1; i <= num; i++) {
			System.out.print(a +", ");
			
			a = b;
			b = c;
			c = a + b;
		}

	}

}
