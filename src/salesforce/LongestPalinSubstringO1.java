package salesforce;

//Java implementation of O(n^2)
//time and O(1) space method
//to find the longest palindromic substring
public class LongestPalinSubstringO1 {

	// This function prints the
	// longest palindrome substring
	// (LPS) of str[]. It also
	// returns the length of the
	// longest palindrome
	static int longestPalSubstr(String str) {
	int len=str.length();
	{	if(len<2) return len;}
	int low;
	int high;
	int longest=1;int start=0;
	for(int i=0;i<len;i++){
		low=i-1;
		high=i+1;
		while(high<len && str.charAt(i)==str.charAt(high)) {high++;}
		while(low>=0 && str.charAt(i)==str.charAt(low)) {low--;}
		while(low>=0 && high <len && str.charAt(low)==str.charAt(high)) {low--; high++;}
		int cur_len=high-low-1;
		if(cur_len>longest) {
			longest=cur_len;
			start=low+1;
		}
		
		
	}
	System.out.print("Longest palindrome substring is: ");
	System.out.println(str.substring(start, start + longest ));
	return longest;
	
}

	// Driver program to test above function
	public static void main(String[] args)
	{

		String str = "forgeeksskeeglp1";//--i=2 low=2 ,high=13 lenght=high-low-1
		System.out.println("Length is: "
						+ longestPalSubstr(str));
	}
}
//This is code is contributed by saurabh yadav
