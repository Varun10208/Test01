package neetcode;

import java.util.Arrays;

public class maxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]= {2,7,4,5,-1,-8,0};
		int start=3;
		int end=7;
		int b[]=new int[4];
		System.arraycopy(v, 1, b,0, 4);
		System.out.println(Arrays.toString(b));
		System.out.println(maxSum(v));

	}
public static int maxSum(int[] a) {
	int curSum=0;
	int maxSum=0;
	for(int n:a) {
		if(curSum<0) {
			curSum=0;
		}
		curSum +=n;
		maxSum=Math.max(maxSum, curSum);
	}
	
	return maxSum;
	
}
}
