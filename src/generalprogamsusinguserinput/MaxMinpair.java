package generalprogamsusinguserinput;

//max-min pair of an unsorted array. 

import java.util.*;

public class MaxMinpair {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(a));

		Arrays.sort(a);

		System.out.println(a[n - 1] + " " + a[0]);

	}
}
