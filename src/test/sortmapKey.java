package test;


	// Java Code to sort Map by key value
	import java.util.*;
import java.util.Map.Entry;
	class sortmapKey {

		// This map stores unsorted values
		static Map<String, Integer> map = new HashMap<>();

		// Function to sort map by Key
		public static void sortbykey(Map<String,Integer> map)
		{
			// TreeMap to store values of HashMap
			TreeMap<String, Integer> sorted = new TreeMap<>();

			// Copy all data from hashMap into TreeMap
			sorted.putAll(map);

			// Display the TreeMap which is naturally sorted
	//		System.out.println(sorted);	
			for(Entry<String, Integer> m:sorted.entrySet()) {
				System.out.println("Key-->"+m.getKey()+"value-->"+m.getValue());
			}
		}
		
		// Driver Code
		public static void main(String args[])
		{
			// putting values in the Map
			map.put("Jayant", 80);
			map.put("Abhishek", 90);
			map.put("Anushka", 80);
			map.put("Amit", 75);
			map.put("Danish", 40);

			// Calling the function to sortbyKey
			sortbykey(map);
		}
	}


