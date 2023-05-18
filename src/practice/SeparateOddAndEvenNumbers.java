package practice;

//Separate odd and even numbers in an array 6 4 3 8 5 2 9 
//output 4 8 2 3 5 9 
//import java.util.*;

public class SeparateOddAndEvenNumbers {

	public static void main(String[] args) {
		int[] arr = { 4, 8, 2, 3, 5, 9 };

		for (int a : arr) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			} else if (a % 2 != 0) {
				System.out.print(a + " ");
			}
		}
	}
}