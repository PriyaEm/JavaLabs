package generalprogamsusinguserinput;

//Factorial of large non-negative integer

//6! = 6*5*4*3*2*1

public class FactOfLargeNonNegativeInteger {
	public static void main(String[] args) {

		int facValue = 1, i = 1, largeNum = 0, facNum = 0;

		while (facValue > 0) {
			facValue = facValue * i;
			if (facValue > 0) {
				largeNum = facValue;
				facNum = i;
			}
			i++;
		}

		System.out.println("Non negative number is: " + facNum);
		System.out.println("Factorial of non negative number is: " + largeNum);

	}
}
