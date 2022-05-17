package neetcode;

import java.util.HashMap;
import java.util.Map;

public class validanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkanagram("",""));

	}
	public static boolean checkanagram(String a,String b) {
		if(a.length()!=b.length()) return false;
		if(a.equals(b)) return true;
		Map<Character,Integer> mp= new HashMap<Character,Integer>();
		Map<Character,Integer> mp1= new HashMap<Character,Integer>();
		for(int i=0;i<a.length();i++) {
		//	if(!mp.containsKey(a.charAt(i))) {mp.put(a.charAt(i),1);} else {
			mp.put(a.charAt(i),mp.getOrDefault(a.charAt(i),0)+1);}
		for(int i=0;i<b.length();i++) {
	//		if(!mp.containsKey(b.charAt(i))) {mp1.put(b.charAt(i),1);} else {mp1.put(b.charAt(i),(mp1.get(b.charAt(i))+1));}
			mp1.put(b.charAt(i),mp1.getOrDefault(b.charAt(i),0)+1);}
			
		System.out.println(mp +" "+mp1);
		
			if(mp.equals(mp1)) return true;

		return false;
	}

}
