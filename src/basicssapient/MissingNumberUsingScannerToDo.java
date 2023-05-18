package basicssapient;

import java.util.*;

public class MissingNumberUsingScannerToDo {
	//to solve {5, 6, 10, 8, 7} ... missing number = 9
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array elements: ");
		String str = sc.nextLine();

		String[] s = str.split(" ");

		int[] arr = new int[s.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		Arrays.sort(arr);
		int m = arr.length; //4				

		if (arr[m - 1] != m) { // 5!=4 true

			int n = arr.length + 1;

			int sum = (n * (n + 1)) / 2; // 15

			for (int i = 0; i < arr.length; i++) {
				sum = sum - arr[i]; // 14, 12, 9, 5, 0
			}
		
		System.out.println("Missing number from an array is: " + sum);
		
		} else {
			System.out.println("-1");
		}

	}

}
