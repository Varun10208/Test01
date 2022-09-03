spackage neetcode;

public class maxWaterStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int h[]= {8,1,4,2,1,4,8};
int c[] = {1,2,3,5,6,7};
System.out.println(maxWater(h));
System.out.println(missingNumber(c));
	}
	public static int maxWater(int a[]) {

int max=0;
int l=0,r=a.length-1;
while(l<r) {
	int area = (r-l) * Math.min(a[r],a[l]);
	if(max<area) max=area;
	
	if(a[l]>a[r]) r-=1;
	else l+=1;
}

return max;
		
	}
	
	 public static int missingNumber(int[] nums) {
	        int sum = 0;
	        int total = (nums.length) * (nums.length+1)/2;
	        for(int i = 0; i < nums.length; i++){
	            sum += nums[i];
	        }
	        return total - sum;
	    }
	}
