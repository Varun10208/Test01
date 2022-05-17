package salesforce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GenAlphabetCodes {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter any length number but combination of 1 to 26 ....... ");
			String val = input.next();

			System.out.println("All possible Alphabet codes for the give Number: " + val);
			for (String string : decode(val)) {
				System.out.println(string);
			}
		}

	}

	public static Set<String> decode(String code) {
	    Set<String> result = new HashSet<String>();
	    helper("", code, result);
	    return result;
	}


	public static void helper(String prefix, String code, Set<String> result) {

	    int len = code.length();
	    if (len == 0) {
	        result.add(prefix);
	        return;
	    }
	    if (code.charAt(0) == '0')
	        return;

	    helper(prefix + (char)(code.charAt(0) - '1' + 'a'), code.substring(1), result);

	    if (len >= 2) {
	        int value = Integer.parseInt(code.substring(0, 2));
	        if (value <= 26)
	            helper(prefix + (char)(value - 1 +'a'), code.substring(2), result);
	    }
	}

}
