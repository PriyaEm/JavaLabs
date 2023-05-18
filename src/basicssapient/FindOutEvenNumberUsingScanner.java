package basicssapient;

import java.util.Arrays;
import java.util.Scanner;

public class FindOutEvenNumberUsingScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of integers : ");
		int list = sc.nextInt();

		System.out.println("Enter the list of integers : ");
		Scanner sc1 = new Scanner(System.in);
		String input = sc1.nextLine();

		String[] s = input.split(" ");

		int[] arr = new int[list];
		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " "); //
			}
		}		

	}

}
