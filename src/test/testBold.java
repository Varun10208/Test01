package test;

import java.util.HashMap;

public class testBold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String a="ABC DE F GHIJ";
           String c1="My Name is Varun My is";
         HashMap<String,Integer> hm=new HashMap<>();
         String[] c1a = c1.split(" ");
           for(String s:c1a) {
        	   hm.put(s, hm.getOrDefault(s,0)+1);
           }
           for(String s1:hm.keySet()) {
        	   if(hm.get(s1)>1) { System.out.println(s1);}
           }
	}

}