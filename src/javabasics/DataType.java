package javabasics;

public class DataType {

	public static void main(String[] args) {
//		Premittive Data types - int, double, char, boolean

		// 1.int

		int i = 10;
		i = 20; // i value 10 will be replaced by 20.. latest i value is 20
		System.out.println(i);
		int j = 230;
		int k = 40;
		System.out.println(i + j + k);

		// 2.double
		double d = 12.45;
		double d1 = 100;
		System.out.println(d + d1);

		// 3.char - only single digit value, should be written in single quotes
		char c = 'a';
		char c1 = '1';
		char c2 = '$';
		System.out.println(c);
		System.out.println(c1 + c2);

		// Boolean
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);

		// String - is a class, not a data type

		String s1 = "Hello";
		String s2 = "hi there";
		String s3 = "1000";
		String s4 = "14.25";

		System.out.println(s1 + s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
