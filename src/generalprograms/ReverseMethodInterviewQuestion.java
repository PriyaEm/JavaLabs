package generalprograms;

public class ReverseMethodInterviewQuestion {

	public static void main(String[] args) {
		// // Shanmuga Priya (Guest) was invited to the meeting.
        // Ouput: anshgamu iypr a 
		
		String str = "Shanmuga Priya";
		
		String rev =" ";
		
		//length of a string
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);			
		}
		
		System.out.println(rev);

	}

}
