package firstProgram;

import java.util.Scanner;

public class replaceLowerc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(replaceLowerc(s));

	}
	static String replaceLowerc(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				res = res + '@';
			}
			else {
				res = res + ch;
			}
		}
		return res;
		
	}

}
