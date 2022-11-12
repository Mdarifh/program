package firstProgram;

import java.util.Scanner;

public class AllSubString {
	
	
	/*static void AllString(String s) {
		int n = s.length();
		for (int k = 1; k <=n; k++) {
			for (int i = 0; i <=(n-k); i++) {
				for (int j = i; j <=(i+k)-1; j++) {
					System.out.print(s.charAt(j));
					
				}
				System.out.println();;
				
			}
			
		}
		

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		AllString(s);
	}*/
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = s.length();
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j <=(n-i); j++) {
				for (int k= j; k<=(j+i)-1; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
				
			}
			
		}
		
		
	}
	
	
	
	

}
