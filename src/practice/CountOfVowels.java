package practice;


//Loop through each element of a string and print count of vowels

public class CountOfVowels {
	public static void main(String[] args) {
		String str = "automation";
			str = str.toLowerCase();		
			
			int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}