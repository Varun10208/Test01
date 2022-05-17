package phase1;

public class entryptString {
	
	// Java implementation for Custom
	// Encryption and Decryption of String

	// Function to encrypt the String
	static String encryption(char[] s)
	{
		String encrypted="";
		int l=s.length;
		int k=0;
		int a=(int) Math.floor(Math.sqrt(l));
		int b= (int) Math.ceil(Math.sqrt(l));
		if(a*b<l) {
		if(Math.min(a, b)==a) {
			a++;
		}
		else {
			b++;
		}}
		char c[][] =new char[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(k<l) {
					c[i][j]=s[k];}
				k++;
				
			}
		}
		for(int i=0;i<b;i++) {
			for(int j=0;j<a;j++) {
				encrypted=encrypted+c[j][i];
			
			}
		}
		
		return encrypted;
		
	}

	// Function to decrypt the String
	static String decryption(char []s)
	{
		int l = s.length;
		int b = (int) Math.ceil(Math.sqrt(l));
		int a = (int) Math.floor(Math.sqrt(l));
		System.out.println(a+" "+b);
		String decrypted="";

		// Matrix to generate the
		// Encrypted String
		char [][]arr = new char[a][b];
		int k = 0;
		
		// Fill the matrix column-wise
		for (int i = 0; i <  b; i++)
		{
			for (int j = 0; j < a; j++)
			{
				if (k < l)
				{
					arr[j][i] = s[k];
				}
				k++;
			}
		}

		// Loop to generate
		// decrypted String
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < b; j++)
			{
				decrypted = decrypted +
							arr[i][j];
			}
		}
		return decrypted;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String s = "Optum health";
		String encrypted;
		String decrypted;
		
		// Encryption of String
		encrypted = encryption(s.toCharArray());
		System.out.print("encrypted string"  + encrypted +"\n");
		
		// Decryption of String
		decrypted = decryption( encrypted.toCharArray());
		System.out.print("decrypted string is "+ decrypted);
	}
	}