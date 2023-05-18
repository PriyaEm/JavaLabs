package basicssapient;

import java.util.Arrays;

public class NumWithValueCloseToZero {

	public static void main(String[] args) {

		int[] a = { 2, 3, -2 };
		int curr = 0;
		int near = a[0];
		Arrays.sort(a); // add this

		System.out.println(Arrays.toString(a));

		// find the element nearest to zero
		for (int i = 0; i < a.length; i++) {
			System.out.println("dist from " + a[i] + " = " + Math.abs(0 - a[i]));
			curr = a[i] * a[i];
			if (curr <= (near * near)) {
				near = a[i];
			}
		}
		System.out.println(near);
	}
}