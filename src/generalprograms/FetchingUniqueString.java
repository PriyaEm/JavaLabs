package generalprograms;

public class FetchingUniqueString {

	public static void main(String[] args) {
		
		String str = "ssttyy";
		
		int l = str.length();
		System.out.println(l);
		
		for(int i=l-1; i>=0; i--) {
			if(str.charAt(i)=='s') {
				System.out.print(str.charAt(i));
			}
		}
		
		
	}
}
