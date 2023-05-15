package arraysExperiments;

public class MaxRangeOfAnArray {

	public static void main(String[] args) {

		int[] arr = { 4, 7, 2, 18, 29 };

		System.out.println(maxRange(arr, 1, 4));
	}

	static int maxRange(int[] arr, int start, int end) {

		int maxVal = arr[start];
		for (int i = start; i <= end; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
}
