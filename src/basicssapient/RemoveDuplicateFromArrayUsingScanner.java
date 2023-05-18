package basicssapient;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArrayUsingScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the arraylist : ");
		int arrsize = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		String arrele = sc1.nextLine();

		String[] s = arrele.split(" ");
		
		int[] arr = new int[arrsize];

		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		System.out.println(Arrays.toString(arr));

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		for (int a : arr) {
			lhs.add(a);
		}

		System.out.println(lhs);
	}

}
