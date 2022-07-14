import java.util.HashMap;
import java.util.Map;

public class HashMapPart3 {

	public static void main(String[] args) {
		Map<Integer, Integer> numbers = new HashMap<>();

		// insert entries to the HashMap
		numbers.put(5, 0);
		numbers.put(8, 1);
		numbers.put(9, 2);
		System.out.println("HashMap: " + numbers);

		// replace all value with the square of key
		numbers.replaceAll((key, value) -> key * key);
		;
		System.out.println("Updated HashMap: " + numbers);

	}

}
