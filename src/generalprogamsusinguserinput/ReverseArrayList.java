package generalprogamsusinguserinput;

//reverse the arraylist

import java.util.*;

public class ReverseArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(a));

		for (int i = 0; i < n / 2; i++) {
			int temp = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = temp;
		}

		System.out.println(Arrays.toString(a));
	}
}