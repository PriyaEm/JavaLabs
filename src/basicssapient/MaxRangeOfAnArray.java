package basicssapient;

public class MaxRangeOfAnArray {

	public static void main(String[] args) {

		int[] arr = { 4, 7, 102, 35, 9, 26 };

		int maxVal = arr[0];

		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println(maxVal);

	}

}
