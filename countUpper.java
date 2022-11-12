package firstProgram;

import java.util.Scanner;

public class countUpper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count = 1;
		for (int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);
			if(ch>'A' && ch<'Z') {
				count++;
			}
		}
		
			System.out.println(count);
		
	
		

	}

}
