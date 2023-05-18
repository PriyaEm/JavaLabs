package practice;

//find the duplicate characters in a string. aabbcc

//import java.util.*;

public class FindDuplicateCharFromAString {

	public static void main(String[] args) {

		String str = "aabbcc";
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
}
