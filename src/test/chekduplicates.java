package test;

import java.util.HashMap;
import java.util.Map;

public class chekduplicates {
	// JAVA code to find
	// duplicates in O(n) time
	public static void returndup(int arr[]) {
		Map<Integer,Integer> mp= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				int k=mp.get(arr[i])+1;
				mp.put(arr[i], k);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		for(int p : mp.keySet()) {
			if(mp.get(p)>1) {
				System.out.println(p+" ");
			}
		}
		}

		public static void main(String args[])
		{
			int numRay[] = { 0, 4, 3, 2, 7, 8, 8,2, 3, 1 };
			returndup(numRay);

		/*	for (int i = 0; i < numRay.length; i++) {
				numRay[numRay[i] % numRay.length]
					= numRay[numRay[i] % numRay.length]
					+ numRay.length;
			System.out.println("The repeating elements are : ");
			for (int i2 = 0; i2< numRay.length; i2++) {
				if (numRay[i2] >= numRay.length * 2) {
					System.out.println(i2 + " ");
				}
			}
		}*/}}
