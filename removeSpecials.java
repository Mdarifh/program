package firstProgram;

import java.util.Scanner;

public class removeSpecials {
	static String removeNumber(String s) {
	
	String res = "";
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if(ch>='0' && ch<='9' ) 
		{
			res = res + ch;
		}
		
	}
	return res;
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(removeNumber(s));

	}

}
