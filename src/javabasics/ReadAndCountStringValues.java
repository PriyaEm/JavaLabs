package javabasics;

public class ReadAndCountStringValues {

	public static void main(String[] args) {
		String s = "ssttyyy";
		int sc = 0;
		int tc = 0;

		/*for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 's') {
				sc = sc + 1;
//				System.out.println(sc);
			}
			if (s.charAt(i) == 't') {
				tc = tc + 1;
			}
		}
		System.out.println("s" + sc + " " + "t" + tc);
//		System.out.println("s"+sc);*/
		
		//************ using charArray************
		
		char c[]= s.toCharArray();
//		System.out.println(c.length);
		
		for(int i=0; i<c.length; i++) {
			if(c[i]=='s') {
				sc=sc+1;
			}
			if(c[i]=='t') {
				tc=tc+1;
			}		
		}
		System.out.println("s"+sc+" "+"t"+tc);
		
	}
}
