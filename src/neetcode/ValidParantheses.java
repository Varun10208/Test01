package neetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ValidParan("({[]})..."));
	}
public static boolean ValidParan(String s) {
	char[] sc=s.toCharArray();
	HashMap<Character,Character> hm =new HashMap<>();
	hm.put(')','(');
	hm.put(']','[');
	hm.put('}','{');
	Stack<Character> st=new Stack<>();
	for(char c:sc) {
		if(hm.containsKey(c)) {
		if(!st.isEmpty() && st.peek()==hm.get(c)) {st.pop();}
		else {return false;}
		}
		else {st.push(c);}
	}

	
	return st.isEmpty();
	
}
}
