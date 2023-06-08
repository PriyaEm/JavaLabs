package codingpractice;

public class CountPalindromeInAString {

	public static void main(String[] args) {
		
		String input = "My name is nitin and I can speak malayalam radar racecar";
		
		String[] words = input.split(" ");
		
		int count =0;
		for(String word:words) {
			if(isPalindrome(word)) {
				count++;
				System.out.println(word);			
				
			}
		}
		System.out.println(count);		

	}

	
	public static boolean isPalindrome(String input) {
		int i1 = 0;
		int i2 = input.length()-1;
		
		while(i2>i1){
			if(input.charAt(i1)!=input.charAt(i2)) {
				return false;				
			}
			i1++;
			i2--;		
			
		}
		return true;
	}
}
