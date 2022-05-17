package neetcode;

import java.util.Arrays;

public class selfproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 3, 5, 2, 1, 7 };
		System.out.println(Arrays.toString(selfp(a)));
	}

	private static int[] selfp(int[] a) {
		// TODO Auto-generated method stub
		// int b=1;
		int[] product = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int b = 1;
			for (int j = 0; j < a.length; j++) {

				if (a[j] == a[i])
					continue;
				b = b * a[j];
			}
			product[i] = b;
			// b=1;
		}
		return product;
	}

}
