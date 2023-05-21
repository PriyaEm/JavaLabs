package generalprogamsusinguserinput;

//find missing number from an array

import java.util.*;

public class MissingNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		// sum of all the elements from 1 to n
		int sum = (n + 1) * (n + 2) / 2;

		if (arr[n - 1] != n) {

			for (int i = 0; i < n; i++) {
				sum = sum - arr[i];
			}
			System.out.println(sum);

		} else
			System.out.println("-1");
	}
}