package javabasics;

public class IndexOfMethod {

	public static void main(String[] args) {
		String str = "astbtyyys";
		int fs = str.indexOf("s");
		int ft = str.indexOf("t");
		
		System.out.println("index of s:" + fs);
		System.out.println(str.indexOf("s", fs));		
		
		System.out.println("index of t:" + ft );
		System.out.println(str.indexOf(str, ft));
		
		
	}

}
