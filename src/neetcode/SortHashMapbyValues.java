package neetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapbyValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//BidiMap<String,Integer> bm=new BidiMap<>();
		Map<String,Integer> hm= new HashMap<>();
		ArrayList<Entry<String,Integer>> al= new ArrayList<>(hm.entrySet());
		sortbyvalue(al);
	}
public static void sortbyvalue(ArrayList<Entry<String,Integer>> al) {
	Collections.sort(al,comparator(
			(e1,e1)-> e1.
			));
}
}
