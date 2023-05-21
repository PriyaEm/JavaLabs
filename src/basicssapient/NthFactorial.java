package basicssapient;

//nth factorial

public class NthFactorial {

	// public static void main(String[] args){
	// Scanner scanner = new Scanner(System.in);
	// input = scanner.nextInt();

	public static void main(String[] args) {

//		int n = 17;
		
//		int max = Integer.MAX_VALUE;
//		System.out.println(max);


//		for (int i = 1; i <= n; i++) { // 1, 2, 3, 4, 5
//			output = output * i; // 1, 2,6,24, 120
//			
//			if(output < 1) {
//				System.out.println("the largest non negative number is: " + (i-1));	
//				break;
//			} 				
//		}		
//		System.out.println(output);
		
		
		int facValue = 1, i=1, largeInt=0, facNum=1; 
//		int i=1;
//		int fac = 0;
		while(facValue>0) {
			facValue = facValue * i;
			if (facValue > 0) {
				largeInt=facValue;
				facNum=i;
			}			
			i++;			
		}
		
		System.out.println("the largest non negative Integer is: " + facNum );	// or (i-2)
		
		System.out.println("Factorial of largest non negative Integer is: " + largeInt);

	}

}
