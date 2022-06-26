package generalprograms;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Shanmuga Priya (Guest) was invited to the meeting";
		/*String[] words = s.split(" ");

		String str = "";
		for (String w : words) {
			// System.out.println(w);
			str = str + w;
		}
		System.out.println(str);*/
		
		String str = s.replace(" ", "");
		
		System.out.println(str);
	}
}
