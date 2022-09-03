package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class testBold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String a="ABC DE F GHIJ";
           String c1="My Name is Varun My is";
         Map<String,Integer> hm=new LinkedHashMap<>();
         String[] c1a = c1.split(" ");
           for(String s:c1a) {
        	   hm.put(s, hm.getOrDefault(s,0)+1);
           }
           for(String s1:hm.keySet()) {
        	   if(hm.get(s1)>1) { System.out.println(s1);}
           }
	}

}