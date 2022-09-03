package neetcode;

import java.util.Arrays;

public class selfproductexpitself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[] =new int[] {2,4,5,1};
System.out.println(Arrays.toString(selfproduct(b)));
	}
	
	public static int[] selfproduct(int a[]) {
		int[] result= new int[a.length];
		Arrays.fill(result,1);
		int pre=1,post=1;
		for(int i=0;i<result.length;i++) {
			result[i]=result[i]*pre;
			pre=pre*a[i];
		}
		for(int j=a.length-1;j>=0;j--) {
			result[j]=result[j]*post;
			post=post*a[j];
		}
		return result;
	} 

}
