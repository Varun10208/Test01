package neetcode;
public class stockprofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= new int[]{7,0,4,5,2,6,1};
		System.out.println(max_profit(b));

	}
	
	public static int max_profit(int a[]) {
		int left=0,right=1,profit=0;int maxp=0;
		while(right<a.length){
			if(a[left]<a[right]) { profit = a[right]-a[left];
			maxp=Math.max(maxp, profit);
			}
			else {
				left=right;
			}
			right=right+1;
		}
		return maxp;
		
	}

}
