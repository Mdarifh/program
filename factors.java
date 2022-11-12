package firstProgram;

import java.util.Scanner;

public class factors {
	 public static void factors(int n, int m) {
		 for(int i=n; i>1; i--) {
			 if(n%i==0 && m%i==0) {
				 System.out.println(" " +i);
			 }
		 }
	 }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		factors(m,n);
			
		
	}

}
