package test;

import java.util.Arrays;

public class segregrateposzeroneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[] {1,-4,-5,0,1,2,0,-7};
System.out.println(Arrays.toString(sort1(a)));
	}

	
	public static int[] sort1(int k[]) {
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {
			if(k[i]>=0) {
				if(k[j]<0) {
					int temp=k[i];
					k[i]=k[j];
					k[j]=temp;
				
				}
			}
		
		}
			System.out.println(Arrays.toString(k));}
		for(int i=0;i<k.length;i++) {
			for(int j=i+1;j<k.length;j++) {
				if(k[i]>0) {
					if(k[j]==0) {
						int temp=k[i];
						k[i]=k[j];
						k[j]=temp;
					}
				
				}
		}}
		return k;
		
	}
	public static int[] sort2(int nums[]) {
		int start = 0;
	    int end = nums.length - 1;
	    int index = 0;

	    while (start < end && index <= end) {
	        if (nums[index] < 0) {
	            int temp = nums[index];
	            nums[index] = nums[start];
	            nums[start] = temp;
	            start++;
	            index++;

	        } else if (nums[index] > 0) {
	            int temp = nums[index];
	            nums[index] = nums[end];
	            nums[end] = temp;
	            end--;
	        } else {
	            index++;
	        }
	    }
	    return nums;
		
	}
}
