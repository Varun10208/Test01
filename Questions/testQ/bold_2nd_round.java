package testQ;

import java.util.ArrayList;

public class bold_2nd_round {
	  public static void main(String[] args) {
	      //  System.out.println("Hello, World!");
	      ArrayList<String> al = new ArrayList<String>();
	      al.add("abc");
	      al.add("mno");
	      al.add("xyz");
	      
	      reversear(al);
	      String x="abcd_ef_ghi";
	        
	    }
	    
	    public static void reversear(ArrayList<String> words){
	        ArrayList<String> output=new ArrayList<>();
	        StringBuilder sb=new StringBuilder();
	        for(int i=words.size()-1;i>=0;i--){
	        	
	        	sb.append(words.get(i));
	        	sb.reverse();
	            output.add(sb.toString());
	            sb.delete(0, words.get(i).length());
	            
	        }
	        System.out.println(output);
	    }
	    public static void wordreversewith_intact(String testword){
	        ArrayList<Integer> op=new ArrayList<>();
	        for(int i=0;i<testword.length();i++) {
	        	if(testword.charAt(i)=='_') {
	        		op.add(i);
	        	}
	        }
	        StringBuilder sb=new StringBuilder();
	        for(int i=words.size()-1;i>=0;i--){
	        	
	        	sb.append(words.get(i));
	        	sb.reverse();
	            output.add(sb.toString());
	            sb.delete(0, words.get(i).length());
	            
	        }
	        System.out.println(output);
	    }
}
