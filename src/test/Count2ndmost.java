package test;

import java.util.HashMap;

public class Count2ndmost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Geeks for Geeks";
		System.out.println(ndmostoccuringchar(original));
	}
//this code return 2nd most occuring character in a string
	
	public static int ndmostoccuringchar(String s) {
		HashMap<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(mp.containsKey(s.charAt(i))) {
				mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
			}
			else {
				mp.put(s.charAt(i),1);
			}
			
		}
		int first=0,second=0;
		for(char c:mp.keySet()) {
			if(mp.get(c)>first) {
				second=first;
				first=mp.get(c);
				
			}
			else if(mp.get(c)>second && mp.get(c)<first){
				second=mp.get(c);
			}
		}
		return second;
	}
}
