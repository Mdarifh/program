package firstProgram;

import java.util.Scanner;

public class replaceUpperc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(removeUpperc(s));
	}	
		static String removeUpperc(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' ) 
			{
				res = res + '#';
			}
			else {
				res = res + ch;
			}
			
		}
		return res;
	}

}
