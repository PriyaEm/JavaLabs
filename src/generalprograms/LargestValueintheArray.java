package generalprograms;

public class LargestValueintheArray {

	public static void main(String[] args) {
		int[] arr = { 25, 10, 16, 14, 7, 20 };

		int val = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > val) {
				val = arr[i];				
			}			
		}
		System.out.println("Biggest value in the array is:" + val);
	}

}
