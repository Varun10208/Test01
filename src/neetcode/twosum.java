package neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {3,5,2,1,7};
       System.out.println(Arrays.toString(twosumcheck(a,90)));
	}
	public static int[] twosumcheck(int[] a,int target) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(hm.containsKey(target-a[i])) return new int[]{hm.get(target-a[i]),i};
			else
				hm.put(a[i],i);
		}
		//throw new IllegalArgumentException("No solution exists for two sum");
		return new int[] {};
	}

}
