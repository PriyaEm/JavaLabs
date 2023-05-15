package arraysExperiments;

public class MaxValueInAnArray {

	public static void main(String[] args) {

		int[] arr = { 5, 27, 68, 15, 8 };

		System.out.println(max(arr));

	}

	static int max(int[] arr) {

		int maxVal = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;

	}

}
