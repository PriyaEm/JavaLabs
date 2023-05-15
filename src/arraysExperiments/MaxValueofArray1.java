package arraysExperiments;

public class MaxValueofArray1 {

	public static void main(String[] args) {
		
		int[] arr = { 5, 27, 68, 15, 8 };
		
		//max value of an array
		int maxVal = arr[0];
		
		for (int i=1; i<arr.length; i++) {
			if(arr[i]>maxVal) {
				maxVal = arr[i];				
			}				
		}
		
		System.out.println("Max value of an array is : " + maxVal);
		
		//min value of an array
		
		int minVal = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < minVal) {
				minVal = arr[i];
			}			
		}
		System.out.println("Min value of an Array is : " + minVal);
	}

}
