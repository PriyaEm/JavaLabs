package codingpractice;

public class testmeth {
	static int i = 1;

	public static void main(String args[]) {
		System.out.println(i + ",");
		m(i);
		System.out.println(i);
		double sum = -4 + 1/2 + 2*-3 + 5.0;
		System.out.println(sum);
	}

	public static void m(int i) {
		i += 2;
		
		//diff prm
		String s1 = "Hello";
		String s2 = new String(s1);
		System.out.println(s1==s2);
		
	}
}