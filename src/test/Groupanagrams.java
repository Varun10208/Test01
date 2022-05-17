package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//java code to group anagrams
//time complexity:O(NKLogK) 
class Groupanagrams {
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length==0) 
		{	return new ArrayList();}
		
		Map<String,List<String>> mp=new HashMap<>();
		for(String s:strs) {
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String k=String.valueOf(c);
			if(!mp.containsKey(k)) {
				mp.put(k, new ArrayList<String>());
				mp.get(k).add(s);
			}
			else {
				mp.get(k).add(s);
			}
		}
		System.out.println(mp);
		return new ArrayList(mp.values());
		
		
	}
}