package test;

class chekallintinarow {

// Function to check if every row contains
// all the integers from 1 to N
	static Boolean checkMat(int[][] arr) {
		int N = arr.length;
	//	int M = arr[0].length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (Math.abs(arr[i][j]) >= 1 && Math.abs(arr[i][j]) <= N) {
					arr[i][Math.abs(arr[i][j]) - 1] = -arr[i][Math.abs(arr[i][j]) - 1];
				}
				
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] >= 0 || arr[j][i]>=0) {
					return false;
				}
			}
		}
		return true;
	}

// Driver Code

	public static void main(String[] args) {
		int[][] arr = { { 1, 2,3}, { 2,1,1 }, {3,3,1} };
		if (checkMat(arr)) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}

// This code is contributed by hrithikgarg03188.
