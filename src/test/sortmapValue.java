package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class sortmapValue {
	
	static Map<String, Integer> hm = new HashMap<>();

	// Function to sort map by Key
	public static void sortbyvalue(Map<String,Integer> hm)
	{
		// List to store values of HashMap
		List<Entry<String,Integer>> list = new LinkedList<>(hm.entrySet());

		// Copy all data from hashMap into TreeMap
		Collections.sort(list,
				(i1,i2)->i1.getValue().compareTo(i2.getValue())
				);

		// Display the TreeMap which is naturally sorted
//		System.out.println(sorted);	
		Map<String,Integer> sorted =new LinkedHashMap<>();
		for(Entry<String, Integer> m:list) {
			sorted.put(m.getKey(),m.getValue());
		}
		System.out.println(sorted);
	}
	
	// Driver Code
	public static void main(String args[])
	{
		// putting values in the Map
		    hm.put("Math", 98);
	        hm.put("Data Structure", 85);
	        hm.put("Database", 91);
	        hm.put("Java", 95);
	        hm.put("Operating System", 79);
	        hm.put("Networking", 80);

		// Calling the function to sortbyKey
		sortbyvalue(hm);
	}

}
