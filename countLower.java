package firstProgram;

import java.util.Scanner;

public class countLower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>'a' && ch<'z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
