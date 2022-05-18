package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// array: used to store similar data types values in an array variable
		// advantage: we can store multiple values in a single variable with similar
		// data types

		// disadvantages
		// 1. size is fixed -- this is called static array
		// [ to overcome this problem, we use collections--ArrayList, HashTable, etc.,]
		// - dynamic array
		// 2. stores only similar data type values
		// to overcome this problem, we use Object Array

		// one dimensional array

		// 1. int array
		// lowest bound/index = 0
		// highest bound/index = n-1

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i.length);
		System.out.println(i[2]);
		System.out.println(i[0]);

//		System.out.println(i[4]); // ArrayIndexOutOfBoundException because size of array to 4 (from 0 to 3)
		System.out.println("********************");

		// print all the values of an array

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		System.out.println("********************");
		// 2.double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.77;
		d[2] = 30.33;

		System.out.println(d[2]);

		System.out.println("********************");

		// 3.char array
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '2';
		c[2] = '$';

		System.out.println(c[2]);

		System.out.println("********************");

		// 4.boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println(b[0]);
		System.out.println("********************");

		// 5.String array

		String s[] = new String[3];

		s[0] = "Hello";
		s[1] = "Testing";
		s[2] = "World";

		System.out.println(s[1]);
		System.out.println("********************");

		// 6.Object Array (Object is a class)-- is used to store different data types values
		
		Object ob[] = new Object[6];
		ob[0]="Tom";
		ob[1]="25";
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println(ob[1]);
		System.out.println(ob.length);
		System.out.println("********************");
		
		//print all the values of an object array
		for(int x=0; x<ob.length; x++) {
			System.out.println(ob[x]);
			
		}
	}

}
