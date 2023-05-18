package practice;

public class MissingNumberFromAnArray {

	// find missing number from Array 1 2 4 6 3 7 8

	public static void main(String[] args) {

		
		int[] arr = { 1, 2, 4, 6, 3, 5 };

		int n = arr.length + 1;
		// n(n+1)/2 = 72/2 = 36

		int sum = (n * (n + 1)) / 2;

		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		
		System.out.println(sum);

	}
}
