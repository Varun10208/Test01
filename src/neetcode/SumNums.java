package neetcode;

public class SumNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="2Welcome123To456India789abc";
		int sum=0;
		String temp="0";
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				temp+=input.charAt(i);
			//	System.out.print(temp);
			}
			else { sum+=Integer.parseInt(temp);
			temp="0";
			//System.out.println(sum);
			}
			
		
			
		}
		System.out.println(sum + Integer.parseInt(temp));
		
	}

}
