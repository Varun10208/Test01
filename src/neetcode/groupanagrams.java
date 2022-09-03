package neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(group(new String[]{"listen","silent","dam","mad","bat","tab"}));
	}
	public static List<List<String>>  group(String[] a){
		
		HashMap<String,List<String>> hm=new HashMap<>();
		for(String s:a) {
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String k=Arrays.toString(c);
			if(hm.containsKey(k)) hm.get(k).add(s);
			else {hm.put(k, new ArrayList<>());
			hm.get(k).add(s);}
		}
		return new ArrayList<>(hm.values());
	}

}
