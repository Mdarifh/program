package firstProgram;

import java.util.Scanner;

public class removeSpecial {
	static String removeSpecial(String s) {
		String res = "";
		for (int i = 0; i <s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z'|| ch>='0' && ch<='9') {
				res = res +ch;
			}
			
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(removeSpecial(s));

	}

}
