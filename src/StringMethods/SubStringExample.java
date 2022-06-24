package StringMethods;

public class SubStringExample {

	public static void main(String[] args) {
		
		String str = "Welcome";
		
		// 1 substring(int startIndex)
		System.out.println(str.substring(0)); // returns from index o to all
		
		//2 substring(int startIndex)
		System.out.println(str.substring(3)); //returns from index 3 to all
		
		//3 substring(int startIndex, int endIndex)
		System.out.println(str.substring(2,5)); //returns from index 2 to 5th character of the string
		

		
	}

}
