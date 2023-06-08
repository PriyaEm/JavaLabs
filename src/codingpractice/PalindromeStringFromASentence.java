package codingpractice;

public class PalindromeStringFromASentence {

	public static void main(String[] args) {

		String input = "My name is nitin and I can speak malayalam";
		String[] words = input.split(" ");
		
		for(String word:words) {
			if(isPalindrome(word)) {
				System.out.println(word);
			}			
		}
	}

	public static boolean isPalindrome(String input) {
		int i1 = 0;
		int i2 = input.length() - 1;
		
		while(i2>i1) {
		if(input.charAt(i1)!=input.charAt(i2)) {
			return false;			
		}
		i1++;
		i2--;
		}
		return true;		
	}

}
