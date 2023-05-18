package basicssapient;

//Write a program how to compare two array list

import java.util.*;

public class CompareTwoArrayList {

	public static void main(String[] args) {

		String[] arr1 = { "5", "welcome", "to", "geeks", "4", "geeks" };
		String[] arr2 = { "5", "welcome", "to", "geeks", "4", "geeks" };

		System.out.println(Arrays.equals(arr1, arr2));
	}
}