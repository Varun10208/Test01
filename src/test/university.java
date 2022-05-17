package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class university {
	public static TreeMap<String, List<String>> find_pairs(String[][] a) {

		// # hashmap of students and students course
		// # like {1: (A, B)}
		TreeMap<String, List<String>> tm = new TreeMap<String, List<String>>();
		Map<String, List<String>> hm = new TreeMap<>();
	
		// List<String> p1=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {

			if (tm.containsKey(a[i][0])) {
				tm.get(a[i][0]).add((a[i][1]));
			} else {

				tm.put(a[i][0], new ArrayList<String>());
				tm.get(a[i][0]).add((a[i][1]));
			}

		}
		List<String> l=new ArrayList<>();
		for (int i=0;i<tm.size()-1;i++) {
			for (int j=i+1;i<tm.size();i++) {
				
				
				l=common_courses(new ArrayList<>(tm.get(a[i][0])),new ArrayList<>(tm.get(a[j][0])));
				String p=a[i][0]+","+a[j][0];
				hm.put(p,l);
			//	l.clear();
			
		}

		
	}return (TreeMap<String, List<String>>) hm;}

	public static List<String> common_courses(List<String> x, List<String> y) {
		ArrayList<String> c=new ArrayList<>();
		// # hashmap of students and students course
		// # like {1: (A, B)}
		// List<String> p1=new ArrayList<>();
		for (int i = 0; i < x.size(); i++) {
			for (int j = 0; j < y.size(); j++) {
				if (x.get(i).equals(y.get(j))) {
					c.add(x.get(i));
				}

			}

		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] input = { { "54", "Maths" }, { "61", "Maths" }, { "91", "English" }, { "101", "Maths" },
				{ "61", "Science" } };
		System.out.println(find_pairs(input));

	}

}
