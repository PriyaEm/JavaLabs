package codingpractice;

import java.util.*;

public class PrintAllEvenNumbersBetween0toN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");

		int n = sc.nextInt();

		int i = 0;
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

	}

}
