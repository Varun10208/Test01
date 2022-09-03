package testQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Java code to remove square series from an array like i/o ---1,3,2,4,16 O/P--1,3
public class testz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 2, 4, 16 };
		List<Integer> al = new ArrayList<>();
		Set<Integer> s1 = new HashSet<>();
		al.add(a[0]);
		for (int i = 1; i < a.length; i++) {
		//	System.out.println(a[i-1] + " " + a[i]);
		//	System.out.println(al);
			if (a[i] == a[i - 1] * a[i - 1]) {
				if (!al.isEmpty() && al.get(al.size() - 1) * al.get(al.size() - 1) == a[i]) {
					if (s1.contains(a[i - 1])) {
						al.remove(al.size() - 1);
						s1.remove(a[i]);
					}
				}

			} else {

				al.add(a[i]);
				s1.add(a[i]);
				
			}
			//System.out.println(s1);
			//System.out.println(al);
		}
		System.out.println(al);
	}

}
