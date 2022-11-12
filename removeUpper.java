package firstProgram;

import java.util.Scanner;

public class removeUpper {
	static String removeUpper(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				res = res + ch;
			}
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s  =scan.next();
		System.out.println(removeUpper(s));

	}

}
