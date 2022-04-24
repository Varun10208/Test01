package test;

import java.io.*;
import java.util.*;

public class Indeedround1 {

	public static void main(String[] argv) {
		String[][] logs1 = new String[][] { { "58523", "user_1", "resource_1" }, { "62314", "user_2", "resource_2" },
				{ "54001", "user_1", "resource_3" }, { "200", "user_6", "resource_5" },
				{ "215", "user_6", "resource_4" }, { "54060", "user_2", "resource_3" },
				{ "53760", "user_3", "resource_3" }, { "58522", "user_22", "resource_1" },
				{ "53651", "user_5", "resource_3" }, { "2", "user_6", "resource_1" }, { "100", "user_6", "resource_6" },
				{ "400", "user_7", "resource_2" }, { "100", "user_8", "resource_6" },
				{ "54359", "user_1", "resource_3" }, };

		String[][] logs2 = new String[][] { { "300", "user_1", "resource_3" }, { "599", "user_1", "resource_3" },
				{ "900", "user_1", "resource_3" }, { "1199", "user_1", "resource_3" },
				{ "1200", "user_1", "resource_3" }, { "1201", "user_1", "resource_3" },
				{ "1202", "user_1", "resource_3" } };

		String[][] logs3 = new String[][] { { "300", "user_10", "resource_5" } };

		System.out.print(userdetails(logs1));
	}

	public static Map<String, List<Integer>> userdetails(String[][] a) {
		HashMap<String, List<Integer>> hm = new HashMap<>();
		// List<String> p1=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {

			if (hm.containsKey(a[i][1])) {
				hm.get(a[i][1]).add(Integer.parseInt(a[i][0]));
			} else {

				hm.put(a[i][1], new ArrayList<Integer>());
				hm.get(a[i][1]).add(Integer.parseInt(a[i][0]));
			}

		}
		return finalmap(hm);
	}

	public static Map<String, List<Integer>> finalmap(HashMap<String, List<Integer>> a) {
		Map<String, List<Integer>> pm = new TreeMap<>();
		int temp = 0;
		for (String k : a.keySet()) {
			Collections.sort(a.get(k));
			pm.put(k, new ArrayList<Integer>());
			pm.get(k).add(a.get(k).get(0));
			pm.get(k).add(a.get(k).get(a.get(k).size() - 1));
		}
		return pm;
	}

}
