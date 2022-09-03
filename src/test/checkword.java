package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class checkword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] words= {"port","sad","rabbit","toy","popooooo"};
check(words);
	}
	
	public static void check(String[] a) {
		List<Character> s1=new ArrayList<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
		List<Character> s2=new ArrayList<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
		List<Character> s3=new ArrayList<>(Arrays.asList('z','x','c','v','b','n','m'));
		
		for(String a1:a) {
			
			char[] c1=a1.toCharArray();
			Set<Character> c=new HashSet<>();
		
			for(char x:c1) {c.add(x);}
			if(s1.containsAll(c)||s2.containsAll(c)||s3.containsAll(c)) System.out.println(a1);
		}
		
	}

}
