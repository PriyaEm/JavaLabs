package codingpractice;

import java.util.*;

public class CalculateSumOfOddAndEvenNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");

		int n = sc.nextInt();

		int evenSum = 0, oddSum = 0;

		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}

		}
		System.out.println(evenSum);
		System.out.println(oddSum);

	}
}
