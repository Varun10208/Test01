package SF;

import java.util.ArrayList;
import java.util.HashSet;

public class checkDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[] {2,3,1,1,2};

System.out.println(checkdup(a));
	}
	public static ArrayList<Integer> checkdup(int[] b) { 
		ArrayList<Integer> a=new ArrayList<Integer>();
	HashSet<Integer> hs=new HashSet<>();
	for(int i=0;i<b.length;i++) {
		if(hs.contains(b[i])) {
			a.add(b[i]);
		}
		else {hs.add(b[i]);}
		
	}
return a;
}
}
