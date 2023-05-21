package generalprogamsusinguserinput;

//compare two array list

import java.util.*;

public class CompareTwoArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		String[] a1 = new String[n1];
		String[] a2 = new String[n2];

		for (int i = 0; i < n1; i++) {
			a1[i] = sc.next();
		}

		for (int i = 0; i < n2; i++) {
			a2[i] = sc.next();
		}

		System.out.println(Arrays.toString(a1).replace("]", "").replace("[", "").replace(",", ""));
		System.out.println(Arrays.toString(a2).replace("]", "").replace("[", "").replace(",", ""));

		if (Arrays.equals(a1, a2)) {
			System.out.println("true because given both the list are equal");
		} else
			System.out.println("false because given both the list are not equal");

	}
}
