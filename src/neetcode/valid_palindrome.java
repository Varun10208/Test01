package neetcode;

public class valid_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println (checkPalindrome("maLAya    lam  "));
	}
	public static boolean checkPalindrome(String a) {
		
	StringBuilder original = new StringBuilder(a);
//	char c[]=a.toCharArray();
	/*	for(char b:c) {
			if(Character.isLetterOrDigit(b)) {
				original.append(b);
				
			}
		} */
		 original= new StringBuilder(original.toString().replace(" ", "").toLowerCase());  
		 String finalstr= original.toString();
		 return finalstr.equals(original.reverse().toString());
		 
		
		
	}

}
