package generalprogamsusinguserinput;

//Close to Zero

import java.util.*;

public class CloseToZeroNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
	
		//get the length of an array
		int n = sc.nextInt();

		//declare an integer array
		int[] a = new int[n];

		//get the array elements
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int closeNum = 0;

		if (a[n - 1] > 0) {
			for (int i = 0; i < n; i++) {
				if (a[i] > 0) {
					closeNum = a[i];
					System.out.println(closeNum);
					break;
				}

			}

		} else
			System.out.println(a[n - 1]);

	}
}
