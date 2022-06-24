package StringMethods;

public class JoinExample {

	public static void main(String[] args) {
		
		String date = String.join("/", "25", "5", "2025");
		System.out.println(date);
		
		String time = String.join(":", "12", "30");
		System.out.println(time);
	}
}
