package testQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="abcdeekggaa";
int b=2;
System.out.println(check(a,3));}

//System.out.println(al.get(b-1));

	public static char check(String c,int z) {
		
		Set<Character> s1=new HashSet<>();
		ArrayList<Character> al =new ArrayList<>();
	//	int j=0;
		for(int i=c.length()-1;i>=0;i--) {
			if(s1.contains(c.charAt(i))) {
				s1.remove(c.charAt(i));
			}
			else {
				s1.add(c.charAt(i));
			}
		}
		System.out.println(s1);
		
		if(z>s1.size()) { throw new IllegalArgumentException("No result");}
	//	int i=0;
al.addAll(s1);
System.out.println(al);
	/*	char z1[]=new char[s1.size()];
		for(char p:s1) {
			z1[i]=p;
			i++;
		} 
		char c1=z1[z1.length-z];
		System.out.println(Arrays.toString(z1));   */
		return al.get(al.size()-z);
		
	}
}
