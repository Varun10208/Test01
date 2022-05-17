package salesforce;

import java.util.HashMap;

public class LongestConsecutiveSequence {
	
	public static void main(String[] args)
	{
		int a[]=new int[] {3,5,9,1,4,2,10,11};
		System.out.println(longestConsecutive(a));
	}	    
	public static int longestConsecutive(int[] nums) {
	    HashMap<Integer,Boolean> mp=new HashMap<Integer,Boolean>();
	    for(int n : nums) {
	    	mp.put(n,true);
	    }
	    int longest=0;
	    for(int n:nums) {
	    	if(!mp.get(n)) continue;
	    	mp.put(n,false);
	    	
	    	int left=n-1;
	    	int right=n+1;
	    	int count=1;
	    	 while(mp.containsKey(left)) {
	    		 mp.put(left,false);
	          left--;
	          count++; }
	    	 while(mp.containsKey(right)) {
	    		 mp.put(right,false);
	          right++;
	          count++;
	    	 }
	    	 if(count>longest) longest=count;
	    	
	    }
	    return longest;
	}}

