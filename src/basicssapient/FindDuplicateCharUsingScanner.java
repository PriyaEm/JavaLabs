package basicssapient;

import java.util.*;

public class FindDuplicateCharUsingScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the input string : ");
		String input = sc.next();
		
		//converting string to char Array
		char[] arr = input.toCharArray();
			
		//creating a HashSet to store the duplicate values
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) { 
				if(arr[i]==arr[j]) { 	
					hs.add(arr[i]); // storing the duplicates once
				}				
			}				
		}	
		
		System.out.print("Duplicate char: ");
		for(char item:hs) {			
			System.out.print(item + " ");			
		}
	}

}
