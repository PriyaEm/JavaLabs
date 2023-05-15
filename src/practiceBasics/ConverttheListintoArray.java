package practiceBasics;

import java.util.ArrayList;

public class ConverttheListintoArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("JS");
		languages.add("Python");
		languages.add("c#");
		
		System.out.println("Array List :" + languages);
		
		int length = languages.size();
		
		String[] arr = new String[length];
		
		//Convert ArrayList into the string array
		languages.toArray(arr);
		
		System.out.print("Array : ");
		for (String item : arr) {
			System.out.print(item + ", ");			
		}
		
	}

}
