package companies;

public class driver {

	public static void main(String[] args) {
		System.out.println(checklongP("MalayjjjtftMadammadaM"));
		
		// TODO Auto-generated method stub
	}
	public static String checklongP(String str) {
		int longest=1;
		int high=0;
		int low=0;

		int len=str.length();
		int start=0;
		for(int i=0;i<len;i++){
			low=i-1;
			high=i+1;
			while(high<len && str.charAt(i)==str.charAt(high)) {high++;}
			while(low>=0 && str.charAt(i)==str.charAt(low)) {low--;}
			while(low>=0 && high <len && str.charAt(low)==str.charAt(high)) {low--; high++;}
			int cur_len=high-low-1;
			if(cur_len>longest) {
				longest=cur_len;
				start=low+1;
			}
			
			
		}
		
		
		return str.substring(start,start+longest);
	}

}
