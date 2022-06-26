package generalprograms;

public class NoOfOccuranceOfAString {

	public static void main(String[] args) {

		// Shanmuga Priya (Guest) was invited to the meeting.
		// Ouput: anshgamu iypr a
		// no of occurance

		String str = "Shanmuga Priya";
		// (Guest) was invited to the meeting";
		int count = 0;

		int len = str.length();
		System.out.println("The length of the String:" + len);

		/*
		 * String[] words = str.split(" "); for(String w:words) { System.out.println(w);
		 * }
		 */

		char[] a = str.toCharArray();

		char[] b = { 'a', 'g', 'h', 'i', 'm', 'n', 'p', 'r', 's', 'u', 'y' };

		int lenb = b.length;
		System.out.println("The length of charArray b:" + lenb);

		for (int j = 0; j < b.length; j++) {
			// System.out.println(b[j]);
			for (int i = 0; i < a.length; i++) {
				// System.out.println(a[i]);
				if (a[i] == b[j]) {
					count++;
				}
			}
		}
		System.out.println("The count is:" + count);
	}
}