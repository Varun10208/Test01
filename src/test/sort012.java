package test;

import java.util.Arrays;

public class sort012 {
	static public  int[] sort0120(int arr[]) {
		int c[]= {0,0,0};
		int k[]=new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			
				c[arr[i]]++ ;}
		for(int i =0;i<c[0];i++) {
			k[i]=0;
			//System.out.print(0+",");
		}
		for(int i =c[0];i<c[0]+c[1];i++) {
			//System.out.print(1+",");
			k[i]=1;
		}
		for(int i =c[0]+c[1];i<c[0]+c[1]+c[2];i++) {
			//System.out.print(2+",");
			k[i]=2;
		}
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {0,0,0,1,0,2,0,1,1,1,0};
//int l[]=sort0120(a);
System.out.println(Arrays.toString(sort0120(a)));


	}

}
