package neetcode;

import java.util.Arrays;

public class ValidAnagram2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkanagram2("bOb","bbo"));
	}
	public static boolean checkanagram2(String a ,String b) {
		if(a.length()!=b.length()) return false;
		if(a.equals(b)) return true;
		int c[]=new int[26];
		for(int i=0;i<a.length();i++) {
			c[a.charAt(i)-'a']++;
			c[b.charAt(i)-'a']--;
			 System.out.println(Arrays.toString(c));;
			
		}
		for(int j=0;j<c.length;j++) {
			if(c[j]!=0) return false;
		}
		return true;
		
	}

}
