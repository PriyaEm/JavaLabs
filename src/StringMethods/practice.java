package StringMethods;

public class practice {

	public static void main(String[] args) {

			String str = "Automation Testing";
			
			String[] s1 = str.split("\\s");
			
			for (String s:s1) {
				System.out.println(s);				
			}			
	}
}
