package neetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringKDistinct {
	private static int longestSBwithdisticnctkchar(String s, int k) {
		int n = s.length();

		int lengthOflongeststring = Integer.MIN_VALUE;
		// ArrayList<Character> cur=new ArrayList<>();
		Set<Character> s1 = new HashSet<>();
        int windowEnd=0;
		int windowStart = 0;
		for ( windowEnd = 0; windowEnd < n; windowEnd++) {
			s1.add(s.charAt(windowEnd));
			System.out.println(s1);
			// cur.add(s.charAt(windowEnd));
			// System.out.println(cur);
			
			if (s1.size() > k) {
				// Shrink the window as small as possible until the 'windowSum' is smaller than
				// 'K'
				lengthOflongeststring = Math.max(lengthOflongeststring, windowEnd - windowStart);
				// Discard the element at 'windowStart' since it is going out of the window
				windowStart++; // Shrink the window

			}
		}

		return  Math.max(0, lengthOflongeststring);
	}

	public static void main(String[] args) {
		int result = longestSBwithdisticnctkchar("aabcega", 2);
		System.out.println("Longest string length: " + result);
	}
}
