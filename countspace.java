package firstProgram;

import java.util.Scanner;

public class countspace {
	static int countspace(String s) {
		int count = 0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
			
		}
		
		return count;
		}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(countspace(s)); 
		
	}

}
