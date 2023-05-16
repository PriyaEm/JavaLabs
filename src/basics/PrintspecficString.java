package basics;

public class PrintspecficString {

	public static void main(String[] args) {

		String str = "ssttyy";

		int len = str.length();

		for (int i = 0; i < len; i++) {

			if (str.charAt(i) == 's') {
				System.out.print(str.charAt(i));
			}

		}

	}

}
