package test;

import java.util.HashSet;
import java.util.Set;

public class checkrcalln {
	
	public static boolean checkrcall(int a[][]) {
		int N=a.length;
		boolean k=true;
		Set<Integer> row= new HashSet<>();
		Set<Integer> column= new HashSet<>();
		for(int i=0;i<N;i++) {
			row.clear();
			column.clear();
			for(int j=0;j<N;j++) {
				row.add(a[i][j]);
				column.add(a[j][i]);
			}
			if(row.size()!=N || column.size()!=N) {
				return false;
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int N = 3;
		    int[][] arr = { { 1, 2, 3 },
		                   { 3, 2, 2 },
		                   { 2, 3, 1 } };
		 
		    if(checkrcall(arr)){
		      System.out.println("true");
		    }
		    else{
		      System.out.println("false");
		    }

	}

}
