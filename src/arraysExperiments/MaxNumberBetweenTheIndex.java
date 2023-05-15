package arraysExperiments;

public class MaxNumberBetweenTheIndex {

	public static void main(String[] args) {

		int[] arr = { 5, 17, 28, 6, 8 };

		int maxVal = arr[1];

		for (int i = 1; i < 3; i++) {

			if (arr[i] > arr[1]) {
				maxVal = arr[i];
			}
		}
		System.out.println("Max number of an array between the index 1 and 3 is :" + maxVal);

	}

}
