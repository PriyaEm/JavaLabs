package codingpractice;

public class Solution {
	public static void main(String[] args) {
		short x = 10;
		x = (short) (x * 5);
		System.out.println(x);

		byte y = 127;
		y++;
		y++;
		System.out.println(y);

		if (1 + 1 + 1 + 1 + 1 == 5) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
		int i;
        for(i = 1; i < 6; i++){ 
            if(i > 3) continue;
        }
        System.out.println(i);
        
        
        
        

	}
}
