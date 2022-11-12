package firstProgram;

public class PalindromeNo {

	public static void main(String[] args) {


		/*	int n = 146411; 
			int org_num = n;
			int rev = 0;
			while(n!=0) {
				rev = rev * 10 + n% 10;
				n =  n/10;
			}
			
			
			if(org_num==rev) {
				System.out.println("palindrome");
			}
				
			else {
				System.out.println("not palindrome" );*/
		
			//}
		int[] n  = {2,4,5,6,7,8,9};
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
			
		}
		System.out.println(sum);
	}

}
