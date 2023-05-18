package basicssapient;

import java.util.*;

public class ReverseArrayListUsingScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the arraylist : ");
		int length = scanner.nextInt(); // length of the arraylist

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		String inputs = sc.nextLine(); // arrayList elements

		String[] s = inputs.split(" ");
		

		int[] a = new int[length];

		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}

		for (int i = 0; i < a.length/2; i++) {
			int temp = a[i]; // temp = 12, 35, 1
			a[i] = a[(length - 1) - i]; // a[0] = 1, a[1] = 34, a[2] =10;
			a[(length - 1) - i] = temp; // a[5] = 12, a[4] = 35, a[3] = 1

		}
		System.out.println(Arrays.toString(a));

	}

}
