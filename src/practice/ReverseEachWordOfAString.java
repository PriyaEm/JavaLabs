package practice;

public class ReverseEachWordOfAString {
	//How to reverse each word of a string in Java
	 public static void main(String[] args){
	        
	       String str = "Java langugae is beautiful";
	       
	       String[] s = str.split("\\s");
	       
	       String rev = " ";
	       
	       for(String s1:s) {
	    	   StringBuilder sb = new StringBuilder(s1);
	    	   sb.reverse();
	    	   rev = rev + sb.toString()+ " ";
	       }
	       
	       System.out.println(rev);
	        
	    }
	 
}
