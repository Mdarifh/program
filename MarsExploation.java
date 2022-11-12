package firstProgram;

import java.util.Scanner;

public class MarsExploation {
	
	static int marsExploation(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i=i+3) {
			if(s.charAt(i)!='S') {
				count++;
			}
			if(s.charAt(i+1)!='O') {
				count++;
			}
			if(s.charAt(i+2)!='S') {
				count++;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(marsExploation(s));

	}

}
