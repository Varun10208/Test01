package test;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a=new int[]{2,4,7,8,9,10};
int target=9;
int i=0,j=a.length-1;
System.out.println(search(a,i,j,target));
	}

public static int search(int []b ,int p,int q,int target) {
while(p<=q) {
	int mid=(p+q)/2;
	if(b[mid]==target) return mid;
	else if(mid>target) q=mid-1;
	else p=mid+1;
}
return -1;
	}

}
