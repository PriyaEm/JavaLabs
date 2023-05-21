package arraysExperiments;

import java.util.*;

public class CompareTwoArrayListUsingScanner {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the 1st Array elements: ");
		String s1 = in.nextLine();		
		
		System.out.println("Enter the 2nd Array elements: ");
		String s2 = in.nextLine();
		
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		
			
		if(Arrays.equals(str1,str2)) {
			System.out.println("true because given both list are equal");
		} else {
			System.out.println("false because given both list are not equal");
		}	
		
	}

}
