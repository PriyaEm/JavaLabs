package generalprogamsusinguserinput;

//Separate odd and even numbers in an array

import java.util.*;

public class OddEvenNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(a));

		String evenNum = "", oddNum = "";

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				evenNum = evenNum + " " + a[i];

			} else {
				oddNum = oddNum + " " + a[i];
			}
		}

		System.out.println(evenNum + oddNum);

	}
}
