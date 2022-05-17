package test;

public class Reversefirstwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Geeks for Geeks";
System.out.println(revfirstword(original));
	}
	public static String revfirstword(String s) {
		String k[]=s.split("//s");
		String reverse="";
		
		for(String c:k) {
			StringBuilder p=new StringBuilder(c);
			p.reverse();
			reverse=reverse+p.toString()+" ";
		}
		return reverse.trim();
		
	}

}
