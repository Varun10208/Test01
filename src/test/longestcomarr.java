package test;

import java.util.ArrayList;
import java.util.Arrays;

public class longestcomarr {
	// Java program to DP approach
	// to above solution
	// Function to find the maximum
	// length of equal subarray
	static String[] FindMaxCommonArray(String A[], String B[], int n, int m) {

		// ArrayList<String> common=new ArrayList<String>();

		// Auxiliary dp[][] array
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= m; j++)
				dp[i][j] = 0;

		// Updating the dp[][] table
		// in Bottom Up approach
		for (int i = n - 1; i >= 0; i--)
			for (int j = m - 1; j >= 0; j--)
				// If A[i] is equal to B[i]
				// then dp[j][i] = dp[j + 1][i + 1] + 1
				if (A[i] == B[j])
					dp[i][j] = dp[i + 1][j + 1] + 1;

		int maxm = 0, count1 = 0;

		// Find maximum of all the values
		// in dp[][] array to get the
		// maximum length
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				// Update the length
				maxm = Math.max(maxm, dp[i][j]);

			}

			//
		}

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {

				// Update the length
				if (dp[i][j] == maxm) {
					count1 = j;
				}

			}

			//
		}


		System.out.println(count1);
		// Return the maximum length common array
		if (maxm == 0) {
			return null;
		} else {
			String common[] = new String[maxm];
			for (int c = 0,k1=0; c < maxm; c++) {

				common[c] = B[count1];
				// common.add(B[count1-1]);
				count1 = count1 + 1;
				// maxm=maxm-1;
				
			}
			// System.out.println(Arrays.toString(common));
			return common;
		}
	}

	// Driver Code
	public static void main(String[] args) {

		// Function call to find
		// maximum length of subarray
		String[] A = { "/start", "/pink", "/register","p" ,"/a" };
		// String[] B = { "r" };
		String[] B = { "/start", "/green", "/blue", "/pink", "/register","q", "/red", "/a" };
		int n = A.length;
		int m = B.length;
		System.out.println(Arrays.toString(FindMaxCommonArray(A, B, n, m)));
	}
}
