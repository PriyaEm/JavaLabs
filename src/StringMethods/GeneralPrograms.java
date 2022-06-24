package StringMethods;

public class GeneralPrograms {

	public static void main(String[] args) {
		String str = "pqrs123tu45";
		String res = "";
		String output ="";

		int len = str.length();
		System.out.println(len);// 11

		// **************using for loop **************
		for (int i = len - 4; i <= len - 1; i++) { // 11-4=7; 7<=11 ,
			res = res + str.charAt(i); // t
		}
		System.out.println("Output using for loop:" + res);

		// *************using substring method***********

		System.out.println("Output using substring method:" + str.substring(7));
		//System.out.println(str.substring(7, 9));
		//System.out.println(str.substring(7, 11));

		// **************using toCharArray

		char[] c = str.toCharArray();

		for (int i = len - 4; i <= len - 1; i++) { // 11-4 = 7, 8 <=10,
			output = output + c[i];
			}
		System.out.println("Output using charAt() method:" +  output);
	}
}
