package test;

import java.util.ArrayList;
import java.util.List;

public class continuousHistory {
	
	public static ArrayList<Integer> findContiguousHistory(String[] u1,String[] u2) {
	    int max = 0;
	    int l1=u1.length;
	    int l2=u2.length;
	 ArrayList<Integer> maxSolution =new ArrayList<>();
	    for(int i=0; i<u1.length; i++){
	      for(int j=0; j<u2.length; j++){
	        for(int k = 0; i + k < u1.length && j +k < u2.length; k++)
	        {
	          if(u1[i + k] != u2[j + k]) {
	        	  break;}
	          if(max < k + 1) {
	            max = k + 1;
	            maxSolution.add(i);
	            maxSolution.add(j);
	            maxSolution.add(max); }
	        }
	      } 
	    }
	        
	    return maxSolution;
	  }
	  
	  
	  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] user0 = {"/start", "/pink", "/register", "/orange", "/red", "a"};
		  String[] user1 = {"/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"};
		  findContiguousHistory(user0, user1);
	}

}
